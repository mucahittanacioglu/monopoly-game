package main.java.BL.squares.luckcards;

import main.java.DAL.DPlayer;

public class BLuckCardEleven extends BLuckCards {

    public BLuckCardEleven() {
        setCARD_INFO("Make general repairs on all your property: For each house pay $25, For each hotel pay $100. ");
        setCardID(11);
    }

    @Override //TODO Oyuncuların sahiplik durumuna göre değişiklik gösterecek
    public void performForCard(DPlayer dPlayer) {

    }
}
