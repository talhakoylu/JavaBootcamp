package net.ahmettalha.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data, String message){
        super(data, true, message);
    }

    public SuccessDataResult(T data){
        super(data, true);
    }

    //we can want to return true info with message without data of our operation
    public SuccessDataResult(String message){
        super(null, true, message);
    }

    //we can only want to return true info without any data of our operation.
    public SuccessDataResult(){
        super(null, true);
    }
}
