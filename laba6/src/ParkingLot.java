import java.util.Arrays;

public class ParkingLot {
    private boolean[] spots;

    public ParkingLot(int numSpots) {
        spots = new boolean [numSpots];
        Arrays.fill(spots, false);
    }

    public int park() {
        for (int i = 0; i < spots.length; i++) {
            if (!spots[i]) {
                spots[i] = true;
                return i;
            }
        }
        return -1;
    }

    public boolean leave(int spot) {
        if (spot < 0 || spot >= spots.length || !spots[spot]) {
            return false;
        } else {
            spots[spot] = false;
            return true;
        }
    }
}