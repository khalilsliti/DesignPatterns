package Builder;

public class Vehicule {
    //required parameters
    private String engine;
    private Integer wheels;
    //optinal parameter
    private Boolean airbags;

    private Vehicule(VehiculeBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.airbags = builder.airbags;

    }

    public String getEngine() {
        return engine;
    }

    public Integer getWheels() {
        return wheels;
    }

    public Boolean getAirbags() {
        return airbags;
    }

    public static class VehiculeBuilder {
        //static class cannot be instantiated with new keyword

        //required parameters
        private String engine;
        private Integer wheels;
        //optinal parameter
        private Boolean airbags;


        //vehiculeBuilder only receives required parameters such as number of wheels and engine
        public VehiculeBuilder(String engine, Integer wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public VehiculeBuilder setAirbags(Boolean airbags) {
            this.airbags = airbags;
            return this;
        }

        public Vehicule build() {
            return new Vehicule(this);
        }

    }
}
