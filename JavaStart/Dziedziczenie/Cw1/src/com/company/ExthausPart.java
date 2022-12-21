package com.company;

public class ExthausPart extends Part{

    public boolean legalInEurope;

    public ExthausPart(int idNumber, String idProducer, String model, String partNumber, boolean legalInEurope) {
        setIdNumber(idNumber);
        setIdProducer(idProducer);
        setModel(model);
        setPartNumber(partNumber);
        this.legalInEurope = legalInEurope;
    }

        void printInfo(){
            System.out.println(getIdNumber() + " " + getPartNumber() + " " + getIdProducer() + " " + getModel()
                    + " " + legalInEurope);
        }
    }

