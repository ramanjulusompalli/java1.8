package leetCodeProblems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;




public class Sample {
    public static void main(String[] args) {
        List<Integer> listOfIntegrs=Arrays.asList(1,2,3,4,5);
        //1,4,3,8,5
      List<Integer> updatedList= listOfIntegrs.stream().map(num-> num %2==0 ?num*2:num).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

      //System.out.println(updatedList);

      String name="R a m a n j u l u";

      long spacecount=name.chars().filter(ch->ch== ' ').count();
      System.out.println(spacecount);

      List<Integer> integers=Arrays.asList(1,2,4,5,25,27);
      Set<Integer> missingNumbersSet=new HashSet<>(integers);
      List<Integer> missingNumbers=new ArrayList<>();

      for(int i=1;i<27;i++){
          if(!missingNumbersSet.contains(i)){
              missingNumbers.add(i);
          }

      }
      System.out.println("The Missing numbers"+missingNumbers);

        //Using Stream Api

        List<Integer> integerList=Arrays.asList(1,2,3,3,4,5,5,5,6,6);
        Set<Integer> numberSet=integerList.stream().collect(Collectors.toSet());

        List<Integer> missingNumbersUsinfStream= IntStream.rangeClosed(1,10).filter(
                        num-> !numberSet.contains(num)).
                boxed().
                collect(Collectors.toList());

             System.out.println(missingNumbersUsinfStream);

             //Duplicate elements

        List<Integer> integers1=Arrays.asList(1,2,3,3,4,5,5,5,6,6);

        Set<Integer> unique=new HashSet<>();

        Set<Integer> duplicateElements=integers1.stream().filter(num->!unique.add(num)).collect(Collectors.toSet());
        System.out.println("Duplicate Elemnts"+duplicateElements);





}
}
