package gameStore.dataModel.product;

import java.util.Date;

public class DLC extends Product {
    Date releaseDate;

    public DLC(String name, Genre genre, GameCopyType gameCopyType, GameType gameType, Integer releaseDate, String publisher, Integer copiesAvailable, Double price) {
        super(name, genre, gameCopyType, gameType, releaseDate, publisher, copiesAvailable, price);
    }

    @Override
    public GameType getGameType() {
        return GameType.DLC;
    }
}
