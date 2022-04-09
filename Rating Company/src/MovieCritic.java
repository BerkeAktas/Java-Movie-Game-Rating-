public class MovieCritic extends Critic{
    private Movie theMovie;
    public MovieCritic(double opinion,String criticType,int criticNumber) {
        super(opinion,criticType,criticNumber);
        setLimit(1);
        theMovie = null;

    }
    public MovieCritic(MovieCritic theMovieCritic){
        super(theMovieCritic.getOpinion(),theMovieCritic.getCriticType(),theMovieCritic.getCriticNumber());
        setLimit(theMovieCritic.getLimit());
        setTheMovie(theMovieCritic.getTheMovie());
    }

    @Override
    void resetLimit() {
        setLimit(1);
    }

    @Override
    public void rating() {
        double rate = theMovie.getAverageRating()+((theMovie.getDuration()-150)*0.01)-((2021-theMovie.getYear())*0.01)+getOpinion();
        rate = rate*10;
        rate = Math.round(rate);
        rate = rate/10;

        if (rate >10){
            rate = 10;
            theMovie.setRate(rate);
        }
        else if(rate < 0){
            rate = 0;
            theMovie.setRate(rate);
        }
        else {
            theMovie.setRate(rate);
        }
    }

    public Movie getTheMovie() {
        return theMovie;
    }

    public void setTheMovie(Movie theMovie) {
        this.theMovie = theMovie;
    }
}
