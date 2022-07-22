public class ExerciseFactory {

    Exercise getExercise(ExerciseType exerciseType){

        switch (exerciseType){
            case Gym -> {
                return new Gym();
            }
            case Run -> {
                return new Run();
            }
            case CrossFit -> {
                return new CrossFit();
            }

            default -> {
                throw new RuntimeException("Invalid Exercise Type");
            }
        }
    }
}
