package sia.example.contest;

public class Stage {

    //синглтон
    private Stage(){

    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
