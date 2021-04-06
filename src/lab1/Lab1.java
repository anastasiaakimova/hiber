
package lab1;

import db.NewHibernateUtil;
import entity.Gruppyi;
import entity.Studentyi;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;


/**
 * @author 18738
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Session session = NewHibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        String hql = "FROM Studentyi ";
        Query query = session.createQuery(hql);

        List<Studentyi> studentyi = query.list();
        studentyi.size();

        for (int i = 0; i <= studentyi.size(); i++) {
            System.out.println("\t" + studentyi.get(i).getFamiliya() + "\t"
                    + studentyi.get(i).getImya() + "\t"
                    + studentyi.get(i).getOtchestvo() + "\t"
                    + studentyi.get(i).getGruppyi().getNazvanie());
        }

//Вывести сведения о кол-ве студентов, обучающихся по каждой специальности

        List<Gruppyi> gruppyis = query.list();
        gruppyis.size();

        for (int i = 0; i <= gruppyis.size(); i++) {
            System.out.println("\t" + gruppyis.get(i).getShifr() + "\t"
                    + gruppyis.get(i).getNazvanie() + "\t"
                    + studentyi.get()
            );
        }

        session.getTransaction().commit();
        NewHibernateUtil.shutdown();
    }
}