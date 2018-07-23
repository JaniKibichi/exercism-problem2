object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {

    //given factors and limit, define the variables
    var newall: Set[Int] =Set()

    //Natural numbers, 1 and above
    var naturals=(1 until limit).toSet

    //first check if set is empty
    if(factors.nonEmpty){
      //Loop through the collection and check for multiple of factors
      for(i <- factors){
        naturals.foreach{ ts =>
          if(naturals.contains(ts*i)){
            newall += (ts*i)
          }
          if(ts%i==0){
            newall += ts
          }
        }
      }
    }
    newall.sum
  }
}

