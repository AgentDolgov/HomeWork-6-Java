public class SportsCar extends Car {
    private boolean turbo; // дополнительное поле для спортивного автомобиля
    
    public boolean hasTurbo() { // метод для проверки наличия турбины
        return turbo;
    }
    
    public void setTurbo(boolean turbo) { // метод для установки наличия турбины
        this.turbo = turbo;
    }
}
