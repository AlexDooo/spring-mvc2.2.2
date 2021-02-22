package web.controller;

public class Car {
        private String model;
        private String series;
        private String klass;

    public Car(String model, String series, String klass) {
        this.model = model;
        this.series = series;
        this.klass = klass;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public String getKlass() {
        return klass;
    }

    @Override
    public String toString() {
        return "Car: " +
                "model - '" + model + '\'' +
                ", series - '" + series + '\'' +
                ", klass - '" + klass + '\''+".";
    }
}
