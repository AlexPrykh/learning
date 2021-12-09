package gameStore.dataModel.product;

public class InGameMoney extends Product {
    Integer amount;
    String currency;

    public InGameMoney(String name, Genre genre, GameCopyType gameCopyType, GameType gameType,
                       Integer releaseDate, String publisher, Integer copiesAvailable, Double price) {
        super(name, genre, gameCopyType, gameType, releaseDate, publisher, copiesAvailable, price);
    }

    @Override
    public GameType getGameType() {
        return GameType.IN_GAME_MONEY;
    }
}
