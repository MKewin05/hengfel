
/*
* File: Data.java
* Author: Markó Kevin
* Copyright: 2025, Markó Kevin
* Group: Szoft II-N
* Date: 2025-04-13
* Github: https://github.com/MKewin05/
* Licenc: MIT
*/

package green.weed;

public class Data {
    private Integer id;
    private Double radius;
    private Double lenght;
    private Double result;

    public Data() {
    }

    public Data(Integer id, Double radius, Double lenght, Double result) {
        this.id = id;
        this.radius = radius;
        this.lenght = lenght;
        this.result = result;
    }

    public Data(Double radius, Double lenght, Double result) {
        this.radius = radius;
        this.lenght = lenght;
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

}
