public class Worker implements OnTaskDoneListener,OnTaskErrorListener {
    private  OnTaskDoneListener callback;
    private  OnTaskErrorListener errorCallback;


    public Worker(OnTaskDoneListener listener, OnTaskErrorListener errorListener) {
    }


    public void start(OnTaskDoneListener callback,OnTaskErrorListener errorCallback) {

        for (int i = 0; i < 100; i++) {

            if (i != 33) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Task " + i + " is not done");
            }
        }
    }

    @Override
    public void onDone(String result) {

    }

    @Override
    public void onError(String message) {

    }


}

