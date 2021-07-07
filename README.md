# bitcamp-study

## 1일차
2021.06.28 월

- 교육의 목표 : 웹 개발자 역량 습득

- 소프트웨어 개요
    - System S/W , Application S?W
    - Standalone, Client/Server
- Web Application
    - Back-end (Server언어)
        - Java Application을 작성할때 사용되는 기술
        - Web Server 실행
    - Front-end (Client언어)
        - HTML/CSS/JavaScript 기술 개요
        - Web Browser 실행

- 프로그래밍 준비
    - git : 온라인저장소, 원격 저장소
    - github.com 계정 생성
    - github.com 개인 저장소(repo.) 생성
    - git client : git-scm.com 다운로드 CLI 사용
    - git token : 서버 업로드를 위한 개인사용자만의 암호 발급

## 2일차
2021.06.29 화

- <git 명령어> git 저장소 다루기
    - 새폴더 만들기
        `mkdir 파일명`
    - 서버저장소를 로컬저장소로 복제
        `git clone URL`
    - 서버저장소에서 변경사항이 생긴 후 파일 가져오기
        `$ git pull`
    - 로컬저장소에서 서버저장소로 백업
        `$ git config --global user.email "email.@"` / `$ git config --global user.name "name"` :사용자 계정과 로컬저장소를 연결
        `$ git add .` : 수정,삭제 등 변경된 내용을 찾아서 백업할 명단이 작성됨
        `$ git commit -m "백업설명"` : 백업내용과 함께 파일 백업
        `$ git push` / `username : 이름입력` / `token : 암호입력` : 백업 내용을 서버에 업로드

- 프로그래밍 원리
    - 프로그래밍 : 다양한 언어를 사용해 명령어를 작성하는것.
    - Compile
        c,c++언어를 사용해 명령어를 작성 후 기계어로 번역시키는 과정
        기계어를 CPU가 인식한 후 OS환경에 맞게 로딩후 명령어가 처리된다.
        소스파일(c언어사용)작성 > 확장자 : 파일명.c > `$ gcc 파일명`
    - Interpreter
        JavaScript, PHP, Python 등의 언어를 사용해 명령어를 작성 후 인터프리터 프로그램으로 로딩되어 OS에 실행
        소스파일(JavaScript언어사용)작성 > 확장자 : 파일명.js > `$ node 파일명.js`

- 도구 준비
     - VS Code 편집기 설치
     - c,c++ 컴파일러 설치 : c,c++언어로 작성된 코드를 컴파일해준다. MinGW 사용
     - Node.js 설치 : JavaScript 언어로 작성된 코드를 인터프리터한다.

## 3일차
2021.06.30 수

- 프로그래밍 원리
    - 프로그래밍 (2일차참고)
    - Compile (2일차참고)
    - Interpreter (2일차참고)
    - Hybird
        JAVA언어로 작성된 소스파일이 가상기계어(p-code)로 번역되고 class파일이 생성되는 컴파일 과정 후,
        JVM을 통해 로딩되어 OS에 실행되는 인터프리터방식이 함께 진행되는것을 하이브리드 방식이라고 한다.
        소스파일(JAVA언어사용)작성 > 확장자 : 파일명.java > `$javac -encodig utf-8 -d 클래스저장경로 소스파일경로/파일명.java` > 컴파일 후 .class 파일 생성됨
        클래스 파일을 JVM(실행)시켜주기 > `$ java -classpath (= -cp) class파일위치 소스파일위치.파일명(확장자X)`

- Java 11 JDK 설치
    - JAVA_HOME 환경 변수 설정
    - PATH 변수 설정

- Project 
    - Application과 프로젝트 관계
        - Project : Application에 있어서 최소의 관리단위
    - git 저장소에서 프로젝트 관리
        - 저장소 구조
            - 1단계 : 소스파일과 .class파일을 구분하지 않는다 (git repo. = project)
            - 2단계 : src 폴더와 bin 폴더를 사용하여 소스파일과 .class파일을 구분한다.
            - 3단계 : 프로젝트 규모가 커짐에 따라 소스파일 이외의 다른파일의 저장소가 필요 (Maven 프로젝트 표준 디렉토리 구조)
            - 4단계 : 큰 프로젝트 하나에 여러 프로젝트가 구성되어 있는 구조

- git 저장소에 백업
    - 폴더가 생성되어 있어도 폴더 안에 비어있으면 백업되지 않기때문에 빈폴더에 파일경로을 적은 `README.md` 파일을 만들어서 저장해준다.
    - class파일은 공유하지 않기 때문에 `.gitignore` 파일을 생성해서 백업 제외 대상을 작성해준다. ( 폴더명/ , *파일명)

- Naver D2 coding font 
    주석에 한글 사용시 글자마다 크기가 약간씩 다르므로 정렬이 잘 맞지 않을때가 있다.
    또한 알파벳 대소문자 O,o 숫자 0 등 구분한기 어려운 문자의 가독성을 높히기 위해 코딩 전용 폰트를 설치해준다.
    D2Coding 다운로드 및 설치 후 > VS code 에서 FontFamily 에 D2Coding 을 입력해서 추가

## 4일차
2021.07.01 목

- 프로젝트 관리
    - Project : 가장 큰 프로젝트이자 저장소명이 될 수도 있다
    - 하위 Root Project
    - 하위 Sub Project
    - 하위 Task : 가장 작은 단위의 작업

- 빌드 도구
	- 다양한 빌드 도구: Ant, Maven, Gradle
	- Gradle 빌드 도구를 이용하여 프로젝트 폴더 준비
    - 다움로드 및 설치 후 > PATH 변수 설정 > `$ gradle -v` 현재 설치된 버전을 확인 > `gradle init` 프로젝트 폴더 구성 명령어 입력
    - 명령어 입력 의미 및 순서
        프로젝트 유형 : 2. Appp
        프로그래밍 언어 : 3. Java
        루트프로젝트 아래 생성할 서브프로젝트 개수 작성
        빌드 스크립트 : 1. Groovy
        단위테스트 : 1. Junit4
        프로젝트명 작성 (디폴트값이 폴더이름=프로젝트이름 이므로 엔터쳐도 가능)
        패키지명 작성 (디폴트값 사용하려면 엔터) 

- Gradle 빌드 도구 사용법
	- 빌드 스크립트 파일의 용도
		- settings.gradle : 여러 프로젝트에 공통으로 적용할 설정 정보
		- sub/build.gradle : 서브 프로젝트에만 적용하는 빌드 설정 정보
	- Gradle 기본 작업
		- `init` : 현재 폴더를 프로젝트 폴더로 구성
		- `wrapper` : Gradle 설치 및 실행 파일 생성
		- gradle에 플러그인을 장착하면 더 많은 작업을 수행할 수 있다.

- 'java' gradle 플러그인  
	- `compileJava`
		- src/main/java 폴더에 있는 소스 파일이 모두 컴파일
		- build/classes/java/main 폴더에 .class 파일생성
	- `compileTestJava`
		- src/test/java 폴더에 있는 소스 파일이 모두 컴파일
		- build/classes/java/test 폴더에 .class 파일생성
	- `processResources`
		- src/main/resources 폴더에 있는 파일을 build/resources/main 폴더에 복사
	- `processTestResources`
		- src/test/resources 폴더에 있는 파일을 build/resources/test 폴더에 복사
	- `clean`
		- build 폴더를 삭제
	- `classes`
		- compileJava와 processResources를 한번에 수행
	- `testClasses`
		- classes + compileTestJava + processTestResources 한번에 수행
	- `check`
		- test + 단위 테스트 수행
	- `javadoc`
		- 소스 파일에서 javadoc 주석을 추출하여 HTML된 API 문서를 생성한다.
	- `build`
		- check + assemble(배포파일 생성) 수행

- 'application' gradle 플러그인  	
	- `run`
		- 'java' 플러그인의 classes 작업을 먼저 실행 후
		- application 설정에 지정한 클래스를 실행시킨다.
	- `build`
		- 이 플러그인을 장착한 상태에서 build 작업을 수행하면 고객에게 배포할 수 있는 파일을 build/distributions 폴더에 생성한다.
		- 자바 프로그램을 실행시킬 수 있는 스크립트 파일도 자동 생성된다.

## 5일차
2021.07.03 금

- Eclipse 설치
	- eclipse.org 에서 다운로드 및 설치
    - eclipse IDE : 확장이 용이한 개발툴
    - JDT : 자바 개발 도구
    - WTP : 자바 웹개발 도구

- Eclipse IDE 환경 설정
    - 이클립스 실행 할 때 workspace 폴더 경로 선택 
    - workspace 설정 (워크스페이스 폴더 마다 설정)
        - 메뉴 / Windows / Preferences 클릭
        - General/Workspace
            - Text file encoding을 UTF-8로 설정
            - New text file line delimiter를 Unix 방식으로 설정
        - Java/Code Style/Formatter
            - Eclipse java google style 포맷터 다운로드
            - https://github.com/google/styleguide/blob/gh-pages/eclipse-java-google-style.xml
            - Active profile 에서 구글 스타일 포맷터 임포트하기
        - Java/Installed JRE
            - JDK 홈 폴더가 등록되어 있지 않았다면 추가
        - Web
            - CSS Files : Encoding을 UTF-8로 설정
            - HTML Files : Encoding을 UTF-8로 설정
            - JSP Files : Encoding을 UTF-8로 설정

- Eclipse IDE 관련 작업
    - `eclipseProject` : .project 파일 생성
    - `eclipseClasspath` : .classpath 파일 생성
    - `eclipseJDT` : JDT 관련 파일 생성
    - `eclipse` : = eclipseProject + eclipseClasspath + eclipseJDT 파일 생성
    - `cleanEclipseProject` =  .project 파일 제거
    - `cleanEclipseClasspath` = .classpath 파일 제거
    - `cleanEclipseJDT` =  JDT 관련 파일 제거 (.setting 폴더는 없어지지 않지만 안에 내용은 다 제거됨)
    - `cleanEclipse` =  eclipseProject + eclipseClasspath + eclipseJDT 파일 한번에 제거
    - 이클립스 관련 파일은 각자 개발환경(툴)에 맞춰서 필요한걸 생성해야하기때문에 공유x = 백업x
    - .gitignore 에 관련 파일 백업하지 않도록 추가해주기 ( 폴더명/ , *파일명)

- Eclipse 프로젝트 이름을 설정하기
    - 이클립스는 .project 가 생성될때 build.gradle를 가진 폴더를 프로젝트 이름으로 인식해서 자동 생성시킨다
    - 프로젝트 이름과 파일이름을 다르게 만들어주기위해 eclipse 프로젝트 이름을 설정하는 명령어를 작성해준다
    - eclipse {
         project {
             name = 'study-project'
         }   
     }

- Eclipse로 프로젝트 폴더를 가져오기 
    - File > Import > General > Existing projects into Workspace > Select root directory에서 디렉토리 선택
    - 프로젝트 폴더에 eclipse 용 프로젝트 정보 파일(.project / .settings / .classpath)이 있어야만 임포트 할 수 있다.
        - .project 파일 : 프로젝트 정보를 담은 파일, 프로젝트 및 메뉴를 설정
        - .settings/ : Eclipse IDE의 플러그인 설정 파일이 들어 있는 폴더
        - .classpath 파일 : 자바 라이브러리 파일의 경로 정보
    - eclipse 정보 파일이 없을 떄
        - Gradle 도구를 이용
            - 1) build.gradle 파일의 plugins {} 안에 id 'eclipse' 플러그인 추가
            - 2) 터미널에서  `gradle eclipse` 실행한다.
            - 3) .settings/, .classpath, .project 등이 생성된다. 

- <git 명령어> git 저장소 연결 방법
    - 1. 서버저장소 생성 후 복제
        - gitgub에서 repo. 생성 후 `$ git clone URL` 하면 로컬저장소에 복제됨
    - 2. 로컬저장소 생성 루 서버저장소에 연결
        - 2-1) 새폴더 생성 후 `$ git init` 하면 repo. 성질을 가진 폴더로 변경됨 (= .git폴더 생성됨)
        - 2-2) github 에서 repo. 생성하면 서버저장소가 만들어짐
        - 2-3) 로컬저장소와 서버저장소 연결시키기
            - `git remote` : 서버저장소 위치 확인
            - `git remote -v` : 서버저장소 위치와 서버저장소 (URL) 확인
            - `git pull origin main` : git pull 저장소위치 브랜치이름
            -  `git branch --set-upstream-to=origin/main main`
    - 3. 각각 다른 히스토리를 갖고 있는 로컬과 서버를 연결 시킬때 
        - `git pull origin main --allow-unrelated-histories`

- <git 명령어> git 기록 확인
    - `git log` : 기록을 보여줌
    - `git log --oneline` : 최종기록을 한줄로 보여줌
    - `git log --oneline --all` : 최종기록을 한줄로 모두 보여줌
    - `git log --oneline --all --graph` : 기록을 한줄로 모두 그래프형식으로 보여줌

- Package , Class
    - java-basic/ex01 참고
        - 패키지 : 클래스가 소속된 폴더 (클래스의 이름 충돌을 방지)

        - 클래스 : 같은 이름의 클래스 사용 가능 (구분하기 위해 패키지 사용)

        - 소스 파일 : 소스파일 찾고 관리하기 쉽도록 패키지와 일치하는 폴더에 둔다.

        - 클래스 파일(.class) : 패키지 이름과 같은 폴더에 .class 파일이 생성

        - 경로 작성 방법
            - 패키지 하위에 소스파일
                - java -encoding utf-8 -cp bin/main/com/eomcs/lang Hello3
                - Hello3 가 패키지에 소속되어있기 때문에 패키지명, 클래스파일 이름을 따로 적어줘야함
            - 패키지 하위에 루트패키지, 소스파일
                - java -encoding utf-8 -cp bin/main com.eomcs.lang.Hello3 
                - 한칸띄고 Hello3가 소속된 패키지명을 작성해줌 (-cp 경로와 구분하기 위해 /가 아닌  . 사용)
            - 무소속 패키지
                - javac -encoding utf-8 -d bin/main src/main/java/com/eomcs/lang/Hello4.java
                - 무소속 패키지는 Hello4.java 파일이 com/eomcs/lang폴더에 있더라도 bin/main에 클래스가 생성됨


    - 자바 기초 문법 예제 (eomcs-java)
        - ex01
            - 패키지 다루기
            - 자바 소스 파일과 클래스 블록
            - 소스 파일의 인코딩
            - main() 메서드
        - ex02
            - 여러 줄 주석, 한 줄 주석
            - javadoc 주석
            - 애노테이션

## 6일차
2021.07.05
- 이클립스 Live Share
    - VSCode Live 확장 팩 플러그인 추가
	- 라이브 코딩 작업 테스트

- 콘솔로 출력하기
    - `System.out.`
        - System = 시스템
        - out = JVM의 표준출력장치 콘솔

    - 작성문법
        - System.out.println(정수);
        - System.out.println('문자');
        - System.out.println("문자열");
        - System.out.println(변수명);
        - System.out.println("문자열"+변수명);
        - System.out.println(논리);
            - System.out.println(true);
            - System.out.println(false);
        

    - * 이클립스에서 'sysout' 이라고 입력 후 'ctrl+space'를 누르면 System.out.println()이 자동 입력된다.

    - print() = 출력만
        - `System.out.print(" ");`

    - println() = 출력 + 줄바꿈
        - `System.out.println(" ");` : 값을 주지 않으면 줄바꿈만 수행한다.
        - '\n' 이스케이프 문자도 줄바꿈을 수행한다.  /출력제어 문자 7일차 참고
        - `System.out.print('\n');`   =println 이랑 같은 역할

    - printf() = 출력 + 포맷(형식)
        - `System.out.printf("출력 서식" , 출력할 내용);`
        - 특정 형식을 갖춘 문자열안에 값을 삽입할때는 printf(); 를 사용
        - 형식을 지정하지 않으면 print();와 같은 역할
        
        - 형식을 갖는 값
            - 삽입할 값은 오른쪽에 설정한다.
            - `%s` : 지정한 자리에 오른쪽 문자열을 삽입한다.
            - `%d` : 정수 값을 10진수 문자열로 만들어 삽입한다.
            - `%x` : 정수 값을 16진수 문자열로 만들어 삽입한다.
            - `%c` : 정수 값을 문자로 만들어 삽입한다.
            - `%b` : true/false 값을 문자열로 만들어 삽입한다.
            
        - 삽일될 값의 순서 :
            - %[n$]s : n은 문자열에 삽입될 값의 순서이다. 순서는 1부터 증가한다. (대괄호 [n$]는 생략해도 된다는 뜻 = %n$s)
            - 첫번째 값과 두번째 값, 세번째 값 ... 이 모두 같을땐 첫번째 값만 작성한다.
            - 한 개의 값을 여러 곳에 삽입할 수 있다는 뜻이다.
            - ex) `("%2$d %2$x %2$c\n", 65, 66, 67);` 일때 65=1$, 66=2$, 67=3$ 을 의미함.
            - ex) `("%d %x %c\n", 65);` 일때 모든 문자열에 첫번째 값이 삽입됨.

        - 값을 삽입할 때 사용할 공간 지정 :
            - 문자열을 삽입할 때: `%[-][사용할공간너비]s` : -(마이너스)는 왼쪽 정렬이다. 안 붙이면 기본 오른쪽 정렬이다.
            - `System.out.printf("'%-10s' '%10s'\n", "홍길동", "임꺽정");`
            - `System.out.printf("'%-10d' '%10d'\n", 12345, 12345);`
            - `%-10s` : 왼쪽정렬 후 전체10자리를 확보하고 지정한 자리에 문자열을 삽입하라 그 후 줄바꿈 하라

        - 정수 자릿수 지정(0을 사용한다):
            - %[0][사용할공간너비]d : 앞의 빈자리는 0으로 채운다.
            - %[+][0][사용할공간너비]d : +는 숫자 앞에 부호를 붙인다.
            - `System.out.printf("'%010d' '%07d'\n", 12345, 12345);`
            - `System.out.printf("'%+010d' '%+07d'\n", 12345, -12345);` 
            - * %010d : 오른쪽정렬(기본)이고 전체 10자리를 확보하고 빈자리는 0으로 채우고 정수 값을 10진수 문자열로 만들어 삽입하라

        - 날짜 값 표기할때 :
            - java.util.Date today = new java.util.Date(); 패키지명으로 지정
            - 날짜 및 시간 옵션 (날짜 및 시각 데이터에서 ~추출) :
                - tY : 년도를 추출하여 4자리로 표현
                - ty : 년도를 추출하여 뒤의 2자리로 표현
                - System.out.printf("%1$tY, %1$ty\n", today);

                - tB : 월을 추출하여 전체 이름으로 표현 ex) January
                - tb : 월을 추출하여 단축 이름으로 표현 ex) Jan
                - System.out.printf("%1$tB, %1$tb\n", today);

                - tm : 월을 추출하여 2자리 숫자로 표현 ex) 12, 01
                - System.out.printf("%1$tm\n", today);

                - td : 일을 추출하여 2자리 숫자로 표현 ex) 01, 22
                - te : 일을 추출하여 1자리 숫자로 표현 ex) 1, 22
                - System.out.printf("%1$td %1$te\n", today);

                - tA : 요일을 추출하여 긴 이름으로 표현 ex) Sunday
                - ta : 요일을 추출하여 짧은 이름으로 표현 ex) Sun
                - System.out.printf("%1$tA %1$ta\n", today);

                - tH : 시각을 추출하여 24시로 표현
                - tI : 시각을 추출하여 12시로 표현
                - System.out.printf("%1$tH %1$tI\n", today);

                - tM : 시각을 추출하여 분을 표현
                - System.out.printf("%1$tM\n", today);

                - tS : 시각을 추출하여 초를 표현
                - tL : 시각을 추출하여 밀리초를 표현
                - tN : 시각을 추출하여 나노초를 표현
                - System.out.printf("%1$tS %1$tL %1$tN\n", today);

                - tp : 오전 오후 출력하기
                - 소문자 p를 사용하면 am 또는 pm으로 출력 
                - 대문자 P를 사용하면 AM 또는 PM으로 출력
                - 한글은 대소문자가 없기 때문에 의미없다.
                - System.out.printf("%1$tp\n", today);

                - 년-월-일 시:분:초를 출력하라! 예) 2019-01-04 12:04:30
                - System.out.printf("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", today);

- Literal
    - 리터럴 : 자바 언어로 표현한 값
    - 정수 : 2진수, 10진수, 8진수 16진수 ...
        - 1. 정수 > 2진수
            - 부호 절댓값 방식 : 2진수 맨 앞을 부호비트로 0은 양수, 1은 음수로 표현함
                                 (1로 시작하는 2진수를 구별할수 없게된다.)
            - 1의 보수 : 각각의 비트를 0은 1로, 1은 0으로 바꿔서 구하는것, 자리수의 수와 보수를 더하면 해당 진수의 자리 올림이 발생하고
                         해당자릿수는 0이 되도록 한다.
                         (-8 같은 자리올림이 발생하지 않는 2진수를 표현할 수 없다.)
            - 2의 보수 : 음수의 절댓값을 2진수로 구하기 > 2진수의 1의보수 구하기 > 계산한 1의 보수에 +1하기
                         양수 2진수에서 가장 오른쪽의 0에서 처음으로 나오는 1까지 그대로 두고 나머지를 1의 보수로 바꾸기

            - 2진수 덧셈
                - : 일반적인 덧셈방법으로 계산한다. 비트를 넘어가는 올림수는 무시
            - 2진수 뺼셈
                - : 연산을 수행하는 cpu(중앙처리장치)의 연산장치에는 가산기, 보수기, 시프터, 오버플로 검출기, 레지스터가 있다.
                - 덧셈에 필요한 가산기는 있지만 뺄셈에 필요한 감산기를 찾아볼 수가 없다.
                - 음의 정수를 덧셈으로 계산하기 위해 2의 보수를 이용해서 계산해준다.
    
    - System.out.println(정수);
        - 정수삽입 : 2진수,8진수,10진수,16진수 등으로 작성 가능, 결과값은 10진수로 표현된다.
        - 문자삽입 : 숫자 맨 앞 또는 맨 뒤에 삽입할수 없다. ex) (_1234)
        - 10진수 : 정수값 표현, 일반적으로 사용
            - System.out.println(78);
            - System.out.println(-78);
            - System.out.println(+78);
            - 결과값 78,-78,78

        - 8진수 : 0으로 시작, 코드 작성할땐 잘 사용하지 않음
            - System.out.println(0116);
            - 결과값 78

        - 16진수 : 0x 또는 0X 로 시작, 2진수를 간결하게 표현하기 위해 사용
            - System.out.println(0x4e);
            - System.out.println(0x64);
            - System.out.println(0x064); //0이 앞에 있어도 된다
            - 결과값 78

        - 2진수 : 0b 또는 0B 로 시작, 메모리 상태를 직설적으로 보여줄때 사용
            - System.out.println(0b01001110);
            - 결과값 78

    - 값과 메모리 크기
        - 2bit = 2² -1 = 0~3 까지 표현가능
        - 4bit = 2⁴ -1 = 0~15 까지 표현가능
        - 16bit = 2의 16승 -1 = 0~65535 까지 표현가능 (-32768 ~ +32767) 
        - 32bit = 2의 32승 -1 = 0~4,294,967,295 까지 표현가능 (약 -21억 ~ +21억)
        - 64bit = 2의 64승 -1 = 0~약1900경 까지 표현가능 (약 -900경 ~ + 900경)

    - 2진수와 하드디스크,램 구동,작동원리 등
        - 하드디스크 구동원리 : 자성 물질로 덮인 플래터를 회전시키고, 그 위에 헤드(Head)를 접근시켜 플래터 표면의 자기 배열(sn/ns)을 변경하는 방식으로 데이터를 읽거나 쓴다.
        - 하드디스크, 램 등은 off(0)와 on(1)의 두 상태밖에 구별되지 않기 때문에 2진법을 사용해 데이터를 읽고 저장시킨다.

- 자바 기초문법 예제
    - ex03
		- 리터럴 표기법 요약 정리
		- 값을 메모리에 저장하는 방법: RAM, HDD
		- 10진수, 8진수, 2진수, 16진수 표기법
		- 정수를 2진수로 저장하는 방법
		- 메모리 크기에 따른 값의 범위


## 7일차
2021.07.06

- 이클립스 오류났을 때
        - gradle.build 에서 이클립스설정파일들을 자동생성하라고 세팅된 명령과 이클립스에서 새로 파일을 만들었을때 자동으로 생긴 이클립스설정 파일들이 부딪혀서 먹통이 되거나 오류가 생김
        - 이클립스,파일탐색기 등 종료 후 > 해당 폴더 gradle cleanEclipse (또는 직접 setting,project,classes 폴더를 삭제해준다) > 다시 gradle eclipse

- Literal
    - 실수 : 3.14 , 3.14e ...
        - 고정소수점 :  소수점의 위치를 기준으로 정수부와 실수부로 구분한다. 
        - 부동소수점
            - 개념
                - 전체 자리수(유효숫자)가 가수부이며 소수점의 위치를 2의 n승으로 표현하고 n이 지수부이다.
                - 표현범위가 고정소수점에 비해 크다.
                - 유효숫자와 부동소수점을 각각 2진수로 변환하면 그나마 최소의 오차로 값을 지정할수 있기때문에 2진수 변환을 사용한다.
                - 하지만 결과값에 오차가 발생하는 한계를 가지고 있다.

            - 2진수 변환 방법
                - 실수 값을 부동소수점 방식으로 저장하려면 1과 0으로(2진수) 변환해야 한다. 이때 IEEE 754 명세에 따라 2진수로 변환한다.
                - 소수점 위치에 따라 각각 2진수로 변환후 (무조건 맨앞이 1이 된다.)
                - 맨앞에 1 오른쪽으로 소수점을 옮겨준다. 이때 1.xxxxx 의 xx부분이 가수부가 되고,
                소수점이 이동한 자릿수의 갯수가 지수부가 되어 2의 n승(n=지수부)을 곱해준다. / 정수개념에서 보면 10의 n승이지만 2진법이기때문에 2의 n승
                이를 정규화 과정이라고 한다
                - 32bit(4byte)는 1bit는 부호비트 , 8bit는 지수부 , 나머지 23bit는 가수부로 구분되며
                - 64bit(8byte)는 1bit는 부호비트 , 8bit는 지수부 , 나머지 55bit는 가수부로 구분된다.

            - 클래스 파일로 부동소수점 값 확인하기
                - 실행결과는 10진수로 보이지만 컴퓨터에 컴파일된 내용은 (classes 파일을 확인해보면)
                2진수에서 16진수로 바뀌여서 표현되어 있다. 2진수가 너무 길기 때문에)
                - Exam35.class 파일을 hexdump 플러그인으로 출력한다.
                - 12.375의 2진수 값인 0100_0001_0100_0110_0000_0000_0000_0000을 찾아본다.
                - 보통 에디터에서는 2진수를 16진수로 바꿔 보여주기 때문에 16진수 값 0x41460000을 찾아본다.

            - Exponential 기호 사용하기
                - e 기호를 사용하면 소수점의 위치를 조정하여 표현할 수 있다.
                - System.out.println(0.0314e2); // 0.0314 * 10의2승 = 3.14
                - System.out.println(31.4e-1); // 31.4 * 10의-1승 = 3.14

            - 4바이트(32비트)
                - 단정도(single-precision)
                - 유효자릿수 : 7~8자리 (7까지 가능/유효자릿수가 8자리를 넘어가는 경우 값이 잘려서 저장될 수 있다.)
                - 7자리 숫자 맨앞에 0일때는 0을 제외시킨다.
                - 숫자 맨 뒤에 f 또는 F를 붙인다. (주로 소문자 f사용)
                - System.out.println(3.14f);

            - 8바이트(64비트)
                - 배정도(double-precision)
                - 유효자릿수 : 16자리 (15까지 가능/유효자릿수가 16자리를 넘어가는 경우 값이 잘려서 저장될 수 있다.)
                - 16자리 숫자 맨앞이 0일때는 0을 제외시킨다.
                - 숫자 맨 뒤에 d 또는 D를 붙인다. 생략도 가능
                - System.out.println(3.14d); 

    - 문자 : 문자를 2진수로 바꾸는 규칙을 "문자집합(Character Set)"이라 한다.
        - 문자집합 종류
            - 1. ASCII : 영어 대소문자, 숫자, 특수문자 등
                - 'A' => 100_0001 = 0x41
                - 'B' => 100_0010 = 0x42
                - '1' => 011_0001 = 0x31
                - '2' => 011_0002 = 0x32
                - 한글(11172자)은 정의되어 있지 않다.

            - 2. ISO-8859-1(8비트) : ASCII 문자 + 유럽 문자

            - 3. EUC-KR(16비트) : 한글 2350자에 대한 규칙
                - '가' => 10110000_10100001 = 0xb0a1
                - '각' => 10110000_10100010 = 0xb0a2
                - 현대 통용되는 한글 음절 11172자를 모두 표현할 수 없다.

            - 4. Unicode(16비트) : 영어, 한글 모두 2바이트로 표현
                - 일반적으로 통용되는 대부분의 국가의 문자를 담고 있다
                - 'A' => 0x0041
                - '1' => 0x0031
                - '가' => 0xac00
                - 영어를 2바이트로 표현하기 때문에 비효율적이다.
                - 한글은 새로 정의했기 때문에 EUC-KR과 호환되지 않는다.

            - 5. UTF-8(8비트 ~ 32비트)
                - Unicode에 있는 문자를 규칙에 따라 1 ~ 4바이트로 변환한다.
                - 문자에 따라 바이트 크기가 다르다.
                - ISO-8859-1(영어,숫자,특수문자): 1바이트로 표현한다
                - 'A' => 0x41   
                - '1' => 0x31
                - 한글: 규칙에 따라 3바이트로 표현한다.
                - '가' => 0xac00(10101100_00000000, Unicode) => 1110xxxx 10xxxxxx 10xxxxxx (변환규칙) => 11101010 10110000 10000000 (규칙에 값 적용) => 0xEAB080(UTF-8)

        - java 사용 문자 : 유니코드
            - 전 세계의 모든 문자를 컴퓨터에서 일관되게 처리할 목적으로 정의된 산업 표준 규칙
            - 유니코드는 '문자를 2진수로 표현(인코딩; encoding)'할 때, 두 가지 방식(UTF와 UCS)을 사용
            - 자바는 메모리에 문자를 저장할 때는 'UCS(국제 문제 집합)'를 사용, 외부로 입출력 할 때는 'UTF'를 사용

            - UTF-8 : USC의 코드 값 중에서 00~7F(127개)ASCII에 해당하는 코드 그대로 1바이트로 표현
            그 외 문자코드는 규칙에 따라 2바이트~4바이트까지 변환하여 표현

            - UTF-16 :  USC의 코드 값 그대로 2바이트로 표현
            ASCII 코드와 USC-2 동일하게 2바이트로 표현
            USC-2 를 벗어나는 유니코드는 무조건 4바이트로 변환하여 표현

            - UTF-32 : UCS-4의 4바이트 코드 값을 그대로 표현
            즉 UTF-32는 UCS-4와 같으며 모든 문자를 4바이트 코드 값으로 표현하기 때문에 메모리 낭비가 심함

        - Char 문법
            - char 작성할 경우 : 
                - 유니코드 문자집합 65에 해당하는 A가 출력됨 : ((char)65);
                - 문자코드를 직접 입력할땐 16진수를 사용해줌 : ((char)0x41);
                - char와 정수 값을 연산하면 다음 문자코드인 B가 출력됨 : ((char)0x41 + 1); , ((char)('각' + 1));

            - char 작성하지 않을 경우 문자 출력 :
                - 사라임,시그마,파이 등 특수기호를 키보드로 입력할 수 없을 경우에 해당 유니코드 값을 직접 적는다.
                - \u + 16진수 사용 : ('\u0041') / A가 출력됨, 16진수는 대소문자 구분x
                - \u + 특수기호 코드 : ('\u4eba'); / 人 사람인 한자가 출력됨
                - \ + 8진수 사용 : ('\101') / A가 출력됨, 8진수는 0 ~ 377 범위만 가능
                - 작은 따옴표 : ('A'); / 작은 따옴표는 그대로 출력되기 때문에 char 필요없음

            - char 작성하지 않을 경우 정수 출력 : 
                - 숫자 65가 출력됨 : (65);
                - 정수 값만 연산하면 다음 유니코드인 정수가 출력됨 : (0x41 + 1);, ('각' + 1);
                - 문자의 정수값만 출력됨 : ((int)'A'); / int는 정수를 의미함

        - 폰트 파일의 유형
            - Raster 폰트 (bitmap font)
                - 크기를 늘리면 계단현상 발생
                - 폰트를 도트(점) 정보로 저장
                - 출력 속도가 빠름
                - 단순한 그림이나 복잡한 그림이 파일 크기가 같음
                - 왜? 천연색일 경우 각 점을 3바이트로 표현하기 때문

            - Vector 폰트 (truetype font)
                - 크기를 늘려도 깔끔하게 출력
                - 폰트를 명령어로 저장
                - 그릴 때 마다 명령어를 실행해야 하기 때문에 출력 속도가 느림
                - 그림이 복잡할수록 명령어가 복잡하기 때문에 파일 크기가 커짐

    - 논리값 : 참, 거짓을 표현
        - true : 참, 1
        - false : 거짓, 0
        - 반드시 소문자로 작성
        - 비교 연산( < , > ) / 논리 연산( && , || ) / 값 비교( == )의 결과값으로 사용
        - 논리값은 4바이트 int 메모리에 저장됨
        - c언어는 자바처럼 논리값을 표현하는 키워드가 없음.

    - 문자열 : 기본 타입이 아닌 하나의 객체 형태
        - 큰 따옴표 " " 안에 문자열을 작성
            - "ABC가나다" , "홍길동" ...
            - 문자열안에 유니코드를 포함할수 있음 ("\u0041BC\uac00나다");
        - 문자열과 +연산자
            - + 를 이용하여 문자열과 문자열을 연결 : "홍길동" + "입니다." => "홍길동입니다."
            - 다른 종류의 값을 연결할 수 있음 (다른종류의 값이 문자열로 바뀐 후 연결됨)
                - 문자열+숫자 : ("나이:" + 20);
                - 문자열+논리값 : (false + "재직자 여부");
                - 문자열+문자 : ("성별:" + '여')
                - 문자열+부동소수점 : ("키:" + 170.5f);  /접미사 f는 표현되지않고 결과값은 정수로만 보임

    - 출력 제어 문자 : 화면에 출력되지 않는 명령어
        -  \n : 줄바꿈 문자 / Line Feed(LF), 0x0a
        -  \r : 커서(cursor)를 처음으로 돌리는 문자 / Carrage Return(CR), 0x0d
            - ("Hello,\rabc"); 의 결과값은 abclo
        -  \t : 탭 공간을 추가시키는 문자 / Tab, 0x09
        -  \b : 커서를 뒤로 한 칸 이동시키는 문자 / Backspace, 0x08
            - ("Hello,\b\b\bworld!"); 의 결과값은 Helworld! (콤마도 포함 3번뒤로)
        -  \' : ' 문자를 출력시키는 문자 (' 앞에 \ 역슬래시를 써주기) / Single Quote, 0x27
            - 더블쿼터 " " 안에서 '는 자동출력된다.
        -  \" : " 문자를 출력시키는 문자 (" 앞에 \ 역슬래시를 써주기) / Double Quote, 0x22
            - 싱글쿼터 ' ' 안에서 "는 자동출력된다.
        -  \\ : \ 문자를 출력시키는 문자 (\ 앞에 \ 역슬래시를 써주기)) / Backslash, 0x5c

## 8일차
2021.07.07
- github.com 에서 개인홈페이지 만들기
    - 아이디.github.io 이름의 저장소 생성
    - setting/pages/choose theme 선택
- 변수선언
    - 개념
        - 변수(variables) : 값을 저장하는 메모리
        - 선언 : 메모리의 종류와 크기를 결정하고 그 메모리에 이름을 부여한다.
        - 변수선언 : 변수를 선언한 후 바로 그 이름을 사용하여 메모리에 접근하고 값을 넣고 꺼낸다.
        보통 "변수를 생성한다"라고 표현하기도 한다.
    
    - 변수 이름 규칙
        - 보통 소문자로 시작한다.
        - 대소문자를 구분한다.
        - 여러 단어로 구성된 경우 두 번째 단어의 시작 알파벳은 대문자로 한다.
        - 예) firstName, createdDate, userId (카멜표기법)
        - 상수인 경우 보통 모두 대문자로 이름을 짓는다. 단어와 단어 사이는 _를 사용한다.
        - 예) USER_TYPE, USER_MANAGER

    - 변수 선언 위치
        - 사용할 변수를 블록 시작부분에 미리 선언한다.
        - 변수가 필요할때 중간 부분에 언제든지 선언 가능하다.

    - 변수 선언 문법
        - 한문장에서 한개의 변수 선언
            - * 메모리의종류 메모리이름;
            - int i1; / int i2; / int i3;

        - 한문장에서 여러개의 변수 선언
            - 콤마를 사용한다.
            - * 데이터타입 변수1, 변수2, 변수3;
            - int j1, j2, j3;

        - 변수에 값 할당하기
            - 할당 연산자(assignment operator) = : 변수가 가리키는 메모리에 값을 저장하는 것
            - l-value : = 왼쪽에 있는 변수를 가리킨다. l-value는 리터럴이 될 수 없다. 반드시 메모리여야한다.
            - r-value : = 오른쪽에 있는 변수나 리터럴을 가리킨다. 오른쪽에 지정된 값을 왼쪽 변수가 가리키는 메모리에 저장
            - * 변수명 = 값(변수 또는 리터럴);
            - int age; / age = 20; / age 변수가 가리키는 메모리에 20을 저장

        - 변수 선언과 값 할당을 동시에 하기
            - 변수 초기화 문장(initializer) : 변수 선언과 동시에 값 저장을 한 번에 할당하는 것
            - * 데이터타입 변수명 = 값;
            - int age = 20; 

        - 여러 개의 변수를 한 번에 선언하고 초기화도 함께 수행하기
            - 1. 모든 변수 초기화 : 콤마를 사용한다.
                - * 데이터타입 변수명 = 값; 변수명 = 값;
                - int a1 = 100, a2 = 200; a3 = 300;
            - 2. 일부분만 초기화 : 초기화할 변수에만 값을 넣어준다.
                - a2, a4에만 값을 넣어주면 a2,a4만 초기화된다.
                - int a1, a2 = 200, a3, a4 = 400, a5;

        - 변수의 값 변경
            - 할당 연산자를 이용해 언제든 해당 메모리에 다른 값 저장 가능하다.
            - 가장 마지막줄 연산자의 명령을 실행시킨다.
            - int age;
            - age = 20; 
            - age = 30;

         - 변수를 다른 도구에 사용
            - 다른 도구(메서드; 함수라고도 부른다)에 값을 전달
            - 예) println() 메서드 에 변수를 사용할수 있다.
            - int age = 20; / System.out.println(age);
        
        - 다른 변수에 값을 저장 (값이 같다는 뜻 아님!)
            - age1에 저장된 값을 age2에 복사한다는 의미
            - age1과 age2는 같은 메모리가 아니다.
            - int age1 = 20; / int age2 = age1; 변수 선언 후
            - age1 = 30; 값을 변경 하면
            - age1 , age2 의 결과값이 다르게 출력된다.

    - 변수 선언 오류
        - 같은 이름의 변수를 중복해서 선언할 수 없다.
        - 변수 사용이 선언보다 먼저 올 수 없다.
        - 항상 변수가 선언된 다음에 사용해야안다.
        - 순서 : int count; / count = 50;
        - 값을 지정하지 않은 상태에서 사용할수 없다.

- 변수의 종류
    - 1. primitive data type (원시 데이터 타입)
        - 정수
            - byte   : 1byte 메모리 (-128 ~ 127)
            - short  : 2byte 메모리 (-32768 ~ 32767)
            - int    : 4byte 메모리 (약 -21억 ~ 21억)
            - long   : 8byte 메모리 (약 -922경 ~ 922경)
        - 부동소수점
            - float  : 4byte 메모리 (유효자릿수 7자리)
            - double : 8byte 메모리 (유효자릿수 15자리)
        - 문자
            - char   : 2byte 메모리 (0 ~ 65535). UCS-2 코드 값 저장.
        - 논리값
            - boolean : JVM에서 4 바이트 int 메모리를 사용한다.
                        배열일 경우 1 바이트 byte 메모리를 사용한다.

    - 2. reference(레퍼런스) : 데이터가 저장된 메모리의 주소를 저장하는 메모리.
        - 문자열(주소)
            - String : 문자열이 저장된 메모리의 주소를 저장한다.
                    프로그래밍 입문 단계에서는 그냥 문자열을 저장하는 메모리로 생각
        - 날짜(주소)
            - Date : 날짜 값이 저장된 메모리의 주소를 저장한다.
                     프로그래밍 입문 단계에서는 그냥 날짜를 저장하는 메모리로 생각

- 변수의 메모리 크기
    - 정수
        - byte : 1byte 메모리 (-128 ~ 127)
            - 1바이트 메모리에 담을 수 있는 최소/최대 정수값
            - byte i; / i = -128; / i = 127; 까지 표현가능
            - i = -129; / i = 128; 은 컴파일 오류

        - short : 2byte 메모리 (-32768 ~ 32767)
            - 2바이트 메모리에 담을 수 있는 최소/최대 정수값
            - short i; / i = -32768; / i = 32767; 까지 표현가능
            - i = -32769; / i = 32768; 은 컴파일 오류!

        - int : 4byte 메모리 (약 -21억 ~ 21억)
            - 4바이트 메모리에 담을 수 있는 최소/최대 정수값
            - int i; / i = -2147483648; / i = 2147483647; 까지 표현 가능

        - long : 8byte 메모리 (약 -922경 ~ 922경)
            - 8바이트 메모리에 담을 수 있는 최소/최대 정수값
            - long i; / i = -9223372036854775808L; / i = 9223372036854775807L;

        - * 4 byte 크기를 벗어나는 정수를 표기할 때는 반드시 숫자 뒤에 L 또는 l을 붙여서 표기한다.

- 변수와 리터럴의 크기
    - Exam0412 ~ Exam0426 까지 내용너무 많아서 파일에 정리 (주말에 복습하기!)


- JAVA 키보드 입력 받기
    - System.out : 출력장치 모니터,명령창
    - System.in  : 입력장치 키보드
        - 1. InputStream
            - java.io.InputStream keyboard = System.in;
            - 키보드로 입력한 데이터를 읽을 때 사용할 도구를 준비한다.
    - Scanner 
        - 2. java.util.Scanner keyScan = new java.util.Scanner(keyboard);
            - java.util.Scanner
                - 바이트 단위로 읽어서 int나 문자열로 바꾸려면 또 코딩해야 하는 불편함이 있다.
                이런 불편함을 줄이기 위해 자바에서는 바이트를 개발자가 원하는 값으로 바꿔주는 기능을 제공한다.
            - java.util.Scanner keyScan 
                - keyScan = reference (리모콘 역할)
                - 객체 지향 프로그램에서 객체는 직접 조종하는것 아닌 리모콘을 통해서 조정한다.
                - 리모콘이 해당 객체를 가르키도록 지정한 후 리모콘에서 명령을 내려야한다.
            - new java.util.Scanner(keyboard);
                - keyboard = object (객체)
                - keyboard 을 장착한 새로운 스캐너를 장치로 지정한다.

    - `Scanner - nextLine();`
        - 3. System.out.print("팀명? ");
            - '팀명?' 창을 출력함

        - 4. String str = keyScan.nextLine();
            - reference인 키스캔에게 nextLine()을 요청함
            - `nextLine()` : 키보드에서 한 줄 입력될때까지 기다려라,
                             한줄이 입력되면 문자열만 뽑아서 리턴한다.
                             (리턴=해당자리에 값을 입력한다)
            - 요청된 값을 문자열 데이터타입(String)인 str으로 입력한다.

        - 5. System.out.println(str);
            - 사용자가 입력한 문자열을 출력한다.
            - str을 넣어주는 방법도 가능하지만 두줄을 써줘야하므로 String str = keyScan.nextLine(); / System.out.println(str);
            - 한번에 System.out.println(keyScan.nextLine()); 으로 작성해줌
                - 실행순서
                    - : 괄호 안에 nextLine()가 먼저 실행되고
                    - : println 줄바꿈이 실행된다

        - 6. keyScan.close();
            - 스캐너는 사용 후 키보드와의 연결을 끊고 닫는다.

    - `Scanner - nextInt();`
        - 2.  java.util.Scanner keyboard = new java.util.Scanner(System.in);
            - new java.util.Scanner(System.in);
                - System.in = object (객체)
                - System.in 을 장착한 새로운 스캐너를 장치로 지정한다.

        - 3. System.out.print("int: ");
            - int: 창을 출력함

        - 4. int i = keyboard.nextInt();
            - reference인 키스캔에게 nextInt()을 요청함
            - `nextInt();` : 사용자가 입력한 내용에서 한 개의 토큰(token)을 읽을 때가지 기다린다.
                             (=공백을 아무리 입력해도 넘어가지 않고 엔터를 쳐야 토큰을 인식하기 때문에 그때 넘어감)
                             한 개의 token을 읽으면 4바이트 정수 값으로 바꾼 다음에 리턴한다.
                             (토큰이란 공백으로 구분되는 단어를 뜻한다 / 리턴=해당자리에 값을 입력한다))
                             중간에 여러 개의 공백이 들어가더라도 한 개의 공백으로 간주한다.
                             단어 앞의 공백은 결과값에서 자동으로 제거된다.
                             (공백은 스페이스(space), 탭, 줄바꿈 코드를 말한다.)
                             // 예) aaa    bbb cc ==> aaa, bbb, cc
                             // 사용자가 입려할때 중간에 여러 개의 공백이 들어가더라도 한 개의 공백으로 간주한다.
            - 요청된 값을 정수 데이터타입(int)인 i 으로 입력한다.
            - keyboard.nextInt(); 뒤에 keyboard.nextLine();
                - 사용자가 내용을 입력하고 엔터를 치면 내용+공백 한칸이 생기는데 nextInt();명령어는 토큰만 인식을 하고
                  다음 명령어를 바로 실행해서 줄바꿈이 일어나거나 내용이 넘어가버린다. 이를 방지하기 위해
                  공백 한칸(빈 문자열)을 실행시켜서 버리기 위해 nextInt(); 뒤에 변수명.nextLine(); 을 작성해준다.
    - 현재 일시 알아내기
        - java.sql.Date now = new java.sql.Date(System.currentTimeMillis());
            - 메소드 java.sql.Date , 변수명 now
            - System.currentTimeMillis() : 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을 밀리초로 리턴한다.
            - new java.sql.Date(밀리초) : 넘겨 받은 밀리초를 가지고 년,월,일,시,분,초를 계산한다.
        - 출력문 : Date 메소드 변수명 = 변수명.valueOf(실행문);
            - Date startDate = Date.valueOf(keyScan.nextLine());
            - 2021-07-07 형태의 입력만 가능

    - 실습
        - App1.java 를 App1_1.java로 복사하고 System.in 파일로 코드 작성하기 
        - App2.java 를 App2_1.java로 복사하고 System.in 파일로 코드 작성하기 
        - App3.java 를 App3_1.java로 복사하고 System.in 파일로 코드 작성하기 