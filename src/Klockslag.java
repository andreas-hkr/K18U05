class Klockslag implements Comparable<Klockslag> {
  int tim;
  int min;
  
  public int compareTo(Klockslag k) {
    if  (tim < k.tim || (tim == k.tim && min < k.min))
      return -1;
    else if (tim > k.tim || (tim == k.tim && min > k.min))
      return 1;
    else
      return 0;
  }
  
  @Override
  public String toString() {
    return String.format("%02d:%02d", tim, min);
  }
}