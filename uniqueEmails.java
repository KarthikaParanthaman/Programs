 class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String>uniqueEmails = new HashSet<>();
        for(String email:emails){
               int indexOfDot= email.indexOf('.');
               int indexOfPlus = email.indexOf('+');
                int indexOfAt = email.indexOf('@');
              if(indexOfDot==-1 && indexOfPlus==-1)
                uniqueEmails.add(email);
              else{
                  StringBuilder cleanMail = new StringBuilder();
                  int i;
                  for(i=0;i<indexOfAt;i++){
                      char currChar = email.charAt(i);
                      if(currChar=='+'){
                           uniqueEmails.add(cleanMail.toString()+email.substring(indexOfAt));
                           break;
                      }
                      else if(currChar!='.')
                          cleanMail.append(currChar);
                    
                  }
                  if(i==indexOfAt)
                    uniqueEmails.add(cleanMail.toString()+email.substring(indexOfAt));  
              }
            }
        return uniqueEmails.size();
        }
    }