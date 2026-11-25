package ExceptionHandling.OutOfMemoryAssignment;


import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {

    public void generateOutOfMemory() {

        List<byte[]> memoryList = new ArrayList<>();

        int count = 0;

        while (true) {

            // Create a 1 MB byte array
            byte[] data = new byte[1024 * 1024];

            // Store it so that it cannot be garbage collected
            memoryList.add(data);

            count++;

            System.out.println(
                "Allocated approximately " + count + " MB"
            );
        }
    }
}
