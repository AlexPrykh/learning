package gameStore.dataModel.product;

public class Subscription extends Product {
    Integer days;

    public Subscription(String name, Genre genre, GameCopyType gameCopyType, GameType gameType,
                        Integer releaseDate, String publisher, Integer copiesAvailable, Double price) {
        super(name, genre, gameCopyType, gameType, releaseDate, publisher, copiesAvailable, price);
    }

    @Override
    public GameType getGameType() {
        return GameType.SUBSCRIPTION;
    }

    //    public int subscriptionStatus() {
//    }
}
