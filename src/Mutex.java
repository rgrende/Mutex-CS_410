//September 12, 2022,
//Mutex code used by MutexTestSpinLoop
public class Mutex {
    private boolean available = true;
    public synchronized boolean acquire() { //only this method will be done safely, only one thread at once
        if (!available) {
            return false;
        }
        available = false;
        return true;
    }

    public synchronized void release() { //read & updated boolean value correctly
        available = true;
    }
}
