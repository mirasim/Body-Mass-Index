public class BmiService {
    public float calculate (int weight, float height) {
      float resulteBmi = weight / (height*height);
      return resulteBmi;
    }
}
