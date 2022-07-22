public class main {

    public static void main(String[] args){

        ExerciseFactory exerciseFactory = new ExerciseFactory();

        Exercise crossfit = exerciseFactory.getExercise(ExerciseType.CrossFit);
        crossfit.doExercise();

        Exercise gym = exerciseFactory.getExercise(ExerciseType.Gym);
        gym.doExercise();

        Exercise run = exerciseFactory.getExercise(ExerciseType.Run);
        run.doExercise();

    }
}
