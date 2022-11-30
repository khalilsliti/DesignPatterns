package templatemethod;

public abstract class DataProcessor {  // abstract classes cannot be instanciated

    public void readProcessSaveData()  //defining the steps order for the algorithm in the correct order
    {
        readData();
        processData();
        saveData();
    }
    public abstract void readData();

    public abstract void processData();

    public void saveData() {
        System.out.println("saving data to db");
    }


}
