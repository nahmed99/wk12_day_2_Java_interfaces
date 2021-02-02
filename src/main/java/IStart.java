public interface IStart {

    // Each 'sub-class' will be able to implement the methods
    // to be relevant to only themselves - e.g., Car and Motorbike
    // can Start(), but will do so in different ways.
    String start();

}
