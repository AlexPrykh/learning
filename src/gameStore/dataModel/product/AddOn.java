package gameStore.dataModel.product;

public class AddOn extends Product {
    AddOnType type;

    public AddOn(String name, Genre genre, GameCopyType gameCopyType, GameType gameType, Integer releaseDate, String publisher, Integer copiesAvailable, Double price) {
        super(name, genre, gameCopyType, gameType, releaseDate, publisher, copiesAvailable, price);
    }

    @Override
    public GameType getGameType() {
        return GameType.ADD_ON;
    }
}
