#include <cstring>
#include <iostream>
int main()
{
	char ptr[100];
	std::cin.getline(ptr, 100);
  	int count = 1;
  	for(int i = 0; i< strlen(ptr); i++){
      if(ptr[i] == ' ')
        count++;
    }
	if(count <= 10){
		std::cout << "Caption eligible for the contest";
	}
	else{
		std::cout<< "Caption not eligible for the contest";
	}
	
}