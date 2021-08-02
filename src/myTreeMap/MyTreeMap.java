package myTreeMap;

import java.util.Comparator;

public class MyTreeMap {
    private Comparator comparator;
    private Entry root;
    private int size = 0;

    public MyTreeMap(Comparator comparator) {
        this.comparator = comparator;
    }

    public Object get(Object key) {
        checkComparable(key);
        Entry p = this.getEntry(key);
        return p == null ? null : p.value;
    }

    private void checkComparable(Object key) {
        boolean isComparable = key instanceof Comparable;
        if (!isComparable && comparator == null) {
            throw new RuntimeException("Class " + key.getClass().getName() +
                    " cannot be casted to Comparable!");
        }
    }

    final Entry getEntry(Object key) {
        if (key == null) {
            throw new NullPointerException();
        }

        if (comparator != null) {
            return getEntryWithComparator(key);
        }
        Comparable comparableKey = (Comparable) key;

        Entry entry = this.root;

        while (entry != null) {
            Object entryKey = entry.key;
            int compareResult = comparableKey.compareTo(entryKey);
            if (compareResult < 0) {
                entry = entry.left;
            } else if (compareResult > 0) {
                entry = entry.right;
            } else {
                return entry;
            }
        }
        return null;
    }

    final Entry getEntryWithComparator(Object key) {
        Comparator cpr = this.comparator;
        if (cpr != null) {
            Entry entry = this.root;

            while (entry != null) {
                int compareResult = cpr.compare(key, entry.key);
                if (compareResult < 0) {
                    entry = entry.left;
                } else {
                    if (compareResult > 0) {
                        entry = entry.right;
                    }
                    return entry;
                }
            }
        }
        return null;
    }

    public Object remove(Object key) {
        checkComparable(key);
        Entry entry = getEntry(key);
        if (entry == null) {
            return null;
        } else {
            Object oldValue = entry.value;
            this.deleteEntry(entry);
            return oldValue;
        }
    }

    private void deleteEntry(Entry entry) {
        Entry replacement;
        if (entry.left == null && entry.right == null) {
            replacement = successor(entry);
            entry.key = replacement.key;
            entry.value = replacement.value;
            entry = replacement;
        }
        replacement = entry.left != null ? entry.left : entry.right;

        if (replacement != null) {
            replacement.parent = entry.parent;
            if (entry.parent == null) {
                root = replacement;
            } else if (entry == entry.parent.left) {
                entry.parent.left = replacement;
            } else {
                entry.parent.right = replacement;
            }
        } else if (entry.parent == null) {
            root = null;
        }

        if (entry.parent != null) {
            if (entry == entry.parent.left) {
                entry.parent.left = null;
            } else if (entry == entry.parent.right) {
                entry.parent.right = null;
            }
            entry.parent = null;
        }
    }

    private Entry successor(Entry entry) {
        if (entry == null) {
            return null;
        } else {
            Entry p;
            if (entry.right != null) {
                for (p = entry.right; p.left != null; p = p.left) {
                }
                return p;
            } else {
                p = entry.parent;

                for (Entry ch = entry; p != null && ch == p.right; p = p.parent) {
                    ch = p;
                }
                return p;
            }
        }
    }

    public Object put(Object key, Object value) {
        Entry entry = this.root;
        if (entry == null) {
            compare(key, key);
            this.root = new Entry(key, value, (Entry) null);
            this.size = 1;
            return null;
        } else {
            Comparator comparator = this.comparator;
            int cmp;
            Entry parent;
            if (comparator != null) {
                do {
                    parent = entry;
                    cmp = comparator.compare(key, entry.key);
                    if (cmp < 0) {
                        entry = entry.left;
                    } else {
                        if (cmp <= 0) {
                            return entry.setValue(value);
                        }
                        entry = entry.right;
                    }
                } while (entry != null);
            } else {
                if (key == null) {
                    throw new NullPointerException();
                }

                Comparable comparable = (Comparable) key;

                do {
                    parent = entry;
                    cmp = comparable.compareTo(entry.key);
                    if (cmp < 0) {
                        entry = entry.left;
                    } else {
                        if (cmp <= 0) {
                            return entry.setValue(value);
                        }
                        entry = entry.right;
                    }
                } while (entry != null);
            }

            Entry e = new Entry(key, value, parent);
            if (cmp < 0) {
                parent.left = e;
            } else {
                parent.right = e;
            }
            this.size++;
            return null;
        }
    }

    private int compare(Object key1, Object key2) {
        return this.comparator == null ? ((Comparable) key1).compareTo(key2) :
                this.comparator.compare(key1, key2);
    }

    public int size() {
        return size;
    }

    public boolean containsKey(Object key) {
        return this.getEntry(key) != null;
    }

    public void clear() {
        this.size = 0;
        this.root = null;
    }


    class Entry {
        Object key;
        Object value;
        MyTreeMap.Entry left = null;
        MyTreeMap.Entry right = null;
        MyTreeMap.Entry parent;

        public Entry(Object key, Object value, Entry parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public Object setValue(Object value) {
            Object oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public int hashCode() {
            int keyHash = this.key == null ? 0 : this.key.hashCode();
            int valueHash = this.value == null ? 0 : this.value.hashCode();
            return keyHash ^ valueHash;
        }

        @Override
        public boolean equals(Object object) {
            if (!(object instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) object;
                return MyTreeMap.valEquals(this.key, entry.getKey()) &&
                        MyTreeMap.valEquals(this.value, entry.getValue());
            }
        }

        @Override
        public String toString() {
            return key + " = " + value;
        }
    }

    private static boolean valEquals(Object key1, Object key2) {
        return key1 == null ? key2 == null : key1.equals(key2);
    }
}
