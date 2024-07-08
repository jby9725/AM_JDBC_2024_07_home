package org.koreait;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String cmd = "";
    static int sys_status = 0;
    static List<Article> articles = new ArrayList<>();
    static int lastID = 0;

    static String url = "jdbc:mariadb://localhost:3306/ArticleManager";
    static String userName = "root";
    static String password = "";


    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            if (conn != null) {
                System.out.println("Connected to database");
            }
        } catch (SQLException e) {
            System.out.println("DB 접속 실패");
            e.printStackTrace();
//            throw new RuntimeException(e);
        }


        /////////////////////////////////



        /////////////////////////////////


//        while (sys_status == 0) {
//            System.out.print("명령어 > ");
//            cmd = scanner.nextLine().trim();
//
//            if (cmd.equals("exit")) {
//                sys_status = -1;
//                System.out.println("프로그램 종료");
//                continue;
//            }
//            if (cmd.equals("article write")) {
//                System.out.print("제목 : ");
//                String title = scanner.nextLine();
//                System.out.print("내용 : ");
//                String body = scanner.nextLine();
//
//                Article newArticle = new Article(++lastID, title, body);
//
//                articles.add(newArticle);
//
//            } else if (cmd.equals("article list")) {
//                if (articles.size() == 0) {
//                    System.out.println("게시글 없음");
//                    continue;
//                }
//                System.out.println("   번호    /    제목     ");
//                for (Article article : articles) {
//                    System.out.printf("     %d      /    %s    \n", article.getId(), article.getTitle());
//                }
//            } else {
//                System.out.println("잘못된 명령어");
//            }
//        }
    }
}