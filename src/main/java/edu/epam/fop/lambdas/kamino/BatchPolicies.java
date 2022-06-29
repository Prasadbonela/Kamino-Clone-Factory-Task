package edu.epam.fop.lambdas.kamino;

import edu.epam.fop.lambdas.kamino.equipment.Equipment;
import java.util.Iterator;

public class BatchPolicies {

  public interface BatchPolicy {

    CloneTrooper[] formBatchOf(CloneTrooper base, int count);
  }

  public static BatchPolicy getCodeAwarePolicy(String codePrefix, int codeSeed) {
    // TODO write your code here
    return null;
  }

  public static BatchPolicy addNicknameAwareness(Iterator<String> nicknamesIterator, BatchPolicy policy) {
    // TODO write your code here
    return null;
  }

  public static BatchPolicy addEquipmentOrdering(Equipment equipmentExample, BatchPolicy policy) {
    // TODO write your code here
    return null;
  }
}
