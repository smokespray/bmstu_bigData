public class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void writePrescriptionDrug(Drug drug, Patient8 patient) {
        System.out.println("Doctor - " + name + " Prescribed drug - " + drug.getDrugName() + " to patient - " + patient.getName());
    }

    public void makeProcedure(Procedure procedure, Patient patient) {
        System.out.println("Doctor - " + name + " Made procedure - " + procedure.getProcedureName() + " to patient - " + patient.getName());
    }

    public void doOperation(Operation operation, Patient8 patient) {
        System.out.println("Doctor - " + name + " Made operation - " + operation.getOperationName() + " to patient - " + patient.getName());
    }

    public static class Drug {
        String drugName;

        public String getDrugName() {
            return drugName;
        }

        public Drug(String drugName) {
            this.drugName = drugName;
        }
    }

    public static class Procedure {
        public String getProcedureName() {
            return procedureName;
        }

        String procedureName;

        public Procedure(String procedureName) {
            this.procedureName = procedureName;
        }
    }

    public static class Operation {
        String operationName;

        public Operation(String operationName) {
            this.operationName = operationName;
        }

        public String getOperationName() {
            return operationName;
        }
    }
}
