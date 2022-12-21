package Cw1;

class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        if(ageLimit <= 0)
            throw new IllegalArgumentException("ageLimit has to be positive");
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) {
        checkMaxParticipiansConstraint();
        checkDuplicate(participant);
        checkAgeConstraint(participant);
        participants[size] = participant;
        size++;
    }

    private void checkAgeConstraint(Participant participant) {
        if(participant.getAge() < ageLimit)
            throw new AgeViolationException(ageLimit);
    }

    private void checkMaxParticipiansConstraint() {
        if(size == participants.length)
            throw new MaxCompetitorsException(participants.length);
    }

    private void checkDuplicate(Participant participant){
        for (int i = 0; i < size; i++) {
            if(participants[i].getDocumentId().equals(participant.getDocumentId()))
                throw new DuplicateException(participant);
        }
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}
