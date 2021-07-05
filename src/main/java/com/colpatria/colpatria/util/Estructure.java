package com.colpatria.colpatria.util;

import java.util.ArrayList;

public class Estructure {

        private boolean state;
        private String message;
        private Integer responseCode;
       // private int total;
        private ArrayList<Data> data;
        //private Data data;


        public Estructure(boolean estate, String message, ArrayList<Data> data) {
            this.state = estate;
            this.message = message;
            this.data = data;
        }
    
        public Estructure(boolean state, String message, Integer responseCode, ArrayList<Data> data) {
            this.state = state;
            this.message = message;
            this.responseCode = responseCode;
            this.data = data;
        }
        
        
        
        public Estructure()
        {
            
        }
        
        

    /**
     * @return boolean return the state
     */
    public boolean isState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return Integer return the responseCode
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * @param responseCode the responseCode to set
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return ArrayList<Data> return the data
     */
    public ArrayList<Data> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

}

