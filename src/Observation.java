class Observation implements Comparable<Observation> {
  int nr;    
  Klockslag tid = new Klockslag();
  double temp; 
  double vindhast; 
  int vindrikt; 
  public int compareTo(Observation annan) {
    return tid.compareTo(annan.tid);
  }
}