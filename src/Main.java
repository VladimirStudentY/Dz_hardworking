public class Main implements OnTaskDoneListener,OnTaskErrorListener {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }

    @Override
    public void onDone(String result) {
    }

    @Override
    public void onError(String message) {
    }

}