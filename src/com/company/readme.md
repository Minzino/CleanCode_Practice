# 간단한 클래스 분리

주어진 시나리오를 참조하여, 출력 예와 같은 결과를 만드시오.

![출처 - 클라우드 스터딩 마린과 메딕](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmBhfT%2FbtrcIgEJy9S%2FIiKsi2hvsDptkAUzxoYpbk%2Fimg.png)
<br/>
![출처 - 클라우드 스터딩 마린과 메딕](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FSrqdS%2FbtrcNlSEPKg%2F3xnmkf4qQ5gLyEzNuuAum1%2Fimg.png)

이 문제는 마린이 스팀팩을 쓰면 자신의 체력이 10 깎이고, 메딕이 힐을 써주면 마린의 체력이 10 올라가게 하는 프로그램을 구성하는 것이다.

딱 봤을 때는 유치해 보일지는 모르겠지만 이 문제에서  클린 코드를 만들기 위한

- 메소드 분리 + 클래스를 분리하는 리팩토링 경험을 간단히 진행할 수 있었다.

## 클린코드를 위한 가이드

1. 작게 만들어라.
- 함수를 만드는 첫 번째 규칙은 '작게'이다. 함수를 만드는 두 번째 규칙은 '더 작게'이다.

2. 한 가지만 해라.
- 함수는 한 가지를 해야 한다. 그 한 가지를 잘해야 한다. 그 한 가지만 해야 한다.

3. 함수 당 추상화 수준은 하나로
- 함수가 확실히 '한 가지' 작업만 하려면 함수 내 모든 문장이 동일한 추상화 수준에 있어야 한다.
- 코드는 위에서 아래로 이야기처럼 일해야 좋다.
4. 서술적인 이름을 사용하라
- 이름이 길어도 괜찮다.
- 이름을 정하느라 시간을 들여도 괜찮다.
- 이름을 붙일 때는 일관성이 있어야 한다.

다음과 같이 연습해보았다.
[(링크)간단한 클래스분리](https://github.com/Minzino/CleanCode_Practice/tree/master/src/com/company/StarCraft.java)