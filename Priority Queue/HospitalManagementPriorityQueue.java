package priority.queue;

import java.util.*;

public class HospitalManagementPriorityQueue {

  private final PriorityQueue<int[]> patients = new PriorityQueue<>(
    (a, b) -> a[0] - b[0]
  );

  public void add(int patientId, int severity) {
    patients.offer(new int[] { severity, patientId });
  }

  public Integer nextPatient() {
    return patients.isEmpty() ? null : patients.poll()[1];
  }

  public static void main(String[] args) {
    System.out.println("Hospital Management Priority Queue");
  }
}
