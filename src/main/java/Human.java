public class Human implements  Runner {



    @Override
    public int capability(BarrierKind kind) {
        switch (kind) {
            case WALL: {
                return 3;
            }

            case TREADMILL: {
                return 300;
            }

            default: {
                return 0;
            }
        }
    }
}

