/*
Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational
pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created
object using a common interface.
 */

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
