public class PatientQueue {

    public static void waitingLine(ISortedList<Patient> tempList, IPriorityQueue<Patient> patientPriorityQueue){

        int index = 1;
        int nextIndex = index + 1;

        while (!tempList.isEmpty()){

            if (index == tempList.getLength()){
                patientPriorityQueue.add(tempList.getEntry(index));
                tempList.remove(index);
            } else if (tempList.getEntry(index).getDate().compareTo(tempList.getEntry(nextIndex).getDate()) == 0){

                for (; nextIndex <= tempList.getLength(); nextIndex++){

                    if (tempList.getEntry(index).getDate().compareTo(tempList.getEntry(nextIndex).getDate()) != 0){
                        nextIndex = index+1;
                        break;
                    } else if (tempList.getEntry(index).getDisability().equals("disabled")){
                        patientPriorityQueue.add(tempList.getEntry(index));
                        tempList.remove(index);
                        nextIndex = index;
                    } else if (tempList.getEntry(nextIndex).getDisability().equals("disabled")) {
                        patientPriorityQueue.add(tempList.getEntry(nextIndex));
                        tempList.remove(nextIndex);
                    }

                }

                for (; nextIndex <= tempList.getLength(); nextIndex++){

                    if (tempList.getEntry(index).getDate().compareTo(tempList.getEntry(nextIndex).getDate()) != 0) {
                        nextIndex = index+1;
                        break;
                    } else if (tempList.getEntry(index).getAge() > 65) {
                        patientPriorityQueue.add(tempList.getEntry(index));
                        tempList.remove(index);
                        nextIndex = index;
                    } else if (tempList.getEntry(nextIndex).getAge() > 65) {
                        patientPriorityQueue.add(tempList.getEntry(nextIndex));
                        tempList.remove(nextIndex);
                    }
                }

                for (; nextIndex <= tempList.getLength(); nextIndex++){

                    if (tempList.getEntry(index).getDate().compareTo(tempList.getEntry(nextIndex).getDate()) != 0) {
                        nextIndex = index+1;
                        break;
                    } else if (tempList.getEntry(index).getPregnancy().equals("preg")) {
                        patientPriorityQueue.add(tempList.getEntry(index));
                        tempList.remove(index);
                        nextIndex = index;
                    } else if (tempList.getEntry(nextIndex).getPregnancy().equals("preg")) {
                        patientPriorityQueue.add(tempList.getEntry(nextIndex));
                        tempList.remove(nextIndex);
                    }

                }

                for (; nextIndex <= tempList.getLength(); nextIndex++){

                    if (tempList.getEntry(index).getDate().compareTo(tempList.getEntry(nextIndex).getDate()) != 0) {
                        nextIndex = index+1;
                        break;
                    } else if (tempList.getEntry(index).getAge() < 18) {
                        patientPriorityQueue.add(tempList.getEntry(index));
                        tempList.remove(index);
                        nextIndex = index;
                    } else if (tempList.getEntry(nextIndex).getAge() < 18) {
                        patientPriorityQueue.add(tempList.getEntry(nextIndex));
                        tempList.remove(nextIndex);
                    }

                }
                patientPriorityQueue.add(tempList.getEntry(index));
                tempList.remove(index);

            }
            else {
                patientPriorityQueue.add(tempList.getEntry(index));
                tempList.remove(index);
            }


        }

    }

}
