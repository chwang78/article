import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println("==프로그램 시작==");

		Scanner sc = new Scanner(System.in);
		List<Articles> list = new ArrayList<>();

		while (true) {
			System.out.printf("명령어)");
			String cmd = sc.nextLine();
			cmd = cmd.trim();

			System.out.printf("입력된 명령어: %s\n", cmd);

			if (cmd.equals("article list")) {
				if (list.size() == 0) {
					System.out.println("게시글이 없습니다");
				}
				for (int i = 0; i < list.size(); i++) {
					Articles article = list.get(i);
				}
			} else if (cmd.equals("article write")) {
				int id = list.size() + 1;
	
				System.out.printf("제목:");
				String title = sc.nextLine();
				System.out.printf("내용:");
				String body = sc.nextLine();

				Articles article = new Articles(id, title, body);
				list.add(article);
				System.out.printf("%s번글이 생성되었습니다\n", article.id);
			} else if (cmd.equals("kkk")) {
				System.out.println("존재하지 않는 명령어입니다\n");
			}

			else if (cmd.equals("exit")) {
				break;
			}

		}

		sc.close();

		System.out.println("==프로그램 종료==");
	}
}

class Articles {
	int id;
	String title;
	String body;

	public Articles(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
}
