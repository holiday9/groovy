new File('./tmp.txt').withReader('UTF-8') {
   reader.eachLine {
       println it
   }
}
