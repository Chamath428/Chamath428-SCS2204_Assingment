object sol extends App{

  case class solution(){
    //following funtion for convert celsius to fahrenheit
      def cel_to_fa(cel:Double):Double=return cel*1.8+32

    //following function for get the volume of a sphere
     def volume_of_sphere (radius:Double):Double=return (4*3.14*radius*radius*radius)/3

     def total_cost (nob:Int):Double= if(nob<=50) return ((nob*24.95)*0.6)+3*nob else return ((nob*24.95)*0.6)+(3*50)+(0.75*(nob-50))

  }

  var sp=solution();
    println("35C in Fahrenheit = "+sp.cel_to_fa(35));
    println("Volume of a sphere = "+sp.volume_of_sphere(6));
    println("Total wholesale cost for 60 copies = "+sp.total_cost(60));

}
