public class GameCritic extends  Critic{
    private Game theGame;
    private int workTime;
    public GameCritic(double opinion,String criticType,int criticNumber) {
        super(opinion,criticType,criticNumber);
        setLimit(8);
        theGame = null;
        workTime = 0;
    }

    public GameCritic(GameCritic theGameGritic) {
        super(theGameGritic.getOpinion(),theGameGritic.getCriticType(),theGameGritic.getCriticNumber());
        setLimit(theGameGritic.getLimit());
        setTheGame(theGameGritic.getTheGame());
        setWorkTime(theGameGritic.getWorkTime());
    }

    @Override
    void resetLimit() {
        setLimit(8);
    }

    @Override
    public void rating() {
        if(theGame.getContentNumber() ==1) {
            double rate = theGame.getAverageRating() + ((10 - theGame.getDuration()) * 0.25) + getOpinion();
            if (rate >100){
                rate = 100;
                theGame.setRate(rate);
            }
            else if(rate < 0){
                rate = 0;
                theGame.setRate(rate);
            }
            else {
                theGame.setRate(rate);
            }
        }
        else if(theGame.getContentNumber() ==2) {
            double rate = theGame.getAverageRating() + (theGame.getDuration() * 0.25) + getOpinion();
            if (rate >100){
                rate = 100;
                theGame.setRate(rate);
            }
            else if(rate < 0){
                rate = 0;
                theGame.setRate(rate);
            }
            else {
                theGame.setRate(rate);
            }
        }
        else {
            double rate = theGame.getAverageRating() + ((theGame.getDuration()-3) * 3) + getOpinion();
            if (rate >100){
                rate = 100;
                theGame.setRate(rate);
            }
            else if(rate < 0){
                rate = 0;
                theGame.setRate(rate);
            }
            else {
                theGame.setRate(rate);
            }
        }
    }

    public Game getTheGame() {
        return theGame;
    }

    public void setTheGame(Game theGame) {
        this.theGame = theGame;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
