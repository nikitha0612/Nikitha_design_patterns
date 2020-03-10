package Behavioral_design;

public class Main 
{
    public static void main(String[] args) 
    {
        Article article = new Article(1, "My Article");
        article.setContent("ABC");      
        System.out.println(article);
         
        ArticleMemento memento = article.createMemento();   
        article.setContent("123");      
        System.out.println(article);
         
        article.restore(memento);      
        System.out.println(article);    
    }
}