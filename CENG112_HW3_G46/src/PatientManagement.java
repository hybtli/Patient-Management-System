import java.io.IOException;

public class PatientManagement {

    public void management() throws IOException {

        ISortedList<Patient> patientSortedList = new SortedList<>();
        IPriorityQueue<Patient> patientPriorityQueue = new PriorityQueue<>();
        FileIO.readFile(patientSortedList);

        System.out.println("The listed patients with all their information: \n");
        for (int index = 1; index <= patientSortedList.getLength(); index++) {
            System.out.println(patientSortedList.getEntry(index));
        }
        System.out.println();
        System.out.println();
        System.out.println();

        ISortedList<Patient> tempList = new SortedList<>();
        for (int index = 1; index <= patientSortedList.getLength(); index++) {
            tempList.add(patientSortedList.getEntry(index));
        }

        PatientQueue.waitingLine(tempList,patientPriorityQueue);
        System.out.println("The line of patients according to their order of receiving treatment time with all their" +
                " information: \n");
        patientPriorityQueue.displayItems();
        System.out.println();
        System.out.println();
        System.out.println();

        int size = patientPriorityQueue.getSize();
        for (int index = 0; index < size; index++) {
            if (index == size - 1){
                System.out.println("The final patient: \n");
                patientPriorityQueue.displayItems();
                patientPriorityQueue.remove();
            }
            else {
                patientPriorityQueue.remove();
                if (index % 5 == 4) {
                    System.out.println("The line of patients after " + (index + 1) + " treatments: \n");
                    patientPriorityQueue.displayItems();
                    System.out.println();
                    System.out.println();
                }
            }

        }

    }

}
