package transport;

import java.util.Queue;

public class STO {
    Queue<Transport> queue;

    public STO(Queue<Transport> queue) {
        this.queue = queue;
    }
public void addCarQueue(Transport transport){
        queue.add(transport);
}
public void carryOutAVehicleInspection(Queue<Transport> queue){

}
}
