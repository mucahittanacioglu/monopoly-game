package BL.squares.luckcards;

import DAL.DPlayer;

public class BLuckCardEleven extends BLuckCards {
    private final String CARD_INFO = "Make general repairs on all your property: For each house pay $25, For each hotel pay $100. ";

    @Override
    public void performForCard(DPlayer dPlayer) {
        // Oyuncuların sahiplik durumuna göre değişiklik gösterecek
    }

    @Override
    public String getCARD_INFO() {
        return this.CARD_INFO;
    }
}