
package lab1;

import db.NewHibernateUtil;
import entity.Gruppyi;
import entity.Studentyi;
import org.hibernate.Query;
import org.hibernate.Session;

// <<<<<<< akimova-dev
// import java.util.List;


// /**
//  * @author 18738
//  */
// =======
// >>>>>>> master
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// <<<<<<< akimova-dev

//         Session session = NewHibernateUtil.getSessionFactory().openSession();

//         session.beginTransaction();
//         String hql = "FROM Studentyi ";
//         Query query = session.createQuery(hql);

//         List<Studentyi> studentyi = query.list();
//         studentyi.size();

//         for (int i = 0; i <= studentyi.size(); i++) {
//             System.out.println("\t" + studentyi.get(i).getFamiliya() + "\t"
//                     + studentyi.get(i).getImya() + "\t"
//                     + studentyi.get(i).getOtchestvo() + "\t"
//                     + studentyi.get(i).getGruppyi().getNazvanie());
//         }

// //Вывести сведения о кол-ве студентов, обучающихся по каждой специальности

//         List<Gruppyi> gruppyis = query.list();
//         gruppyis.size();

//         for (int i = 0; i <= gruppyis.size(); i++) {
//             int k = 0;
//             for(int n =1; n<=studentyi.size(); n++){
//             if(studentyi.get(n).getGruppyi().getShifr() == 1){
//             k++;
//                 }
//             }
//             System.out.println(gruppyis.get(i).getNazvanie() + ":" + k); 
//         }

//         session.getTransaction().commit();
//         NewHibernateUtil.shutdown();
// =======
//             ResultSet rs = null;
//             Session session = NewHibernateUtil.getSessionFactory().openSession();

//             session.beginTransaction();
//             String hql = "FROM Studentyi ";
//             Query query = session.createQuery(hql);

//             List <Studentyi> studentyi = query.list();
//             studentyi.size();

//             for (int i=0; i<=studentyi.size(); i++) {
//                 System.out.println("\t" + studentyi.get(i).getFamiliya()  + "\t"
//                         + studentyi.get(i).getImya() + "\t"
//                          + studentyi.get(i).getOtchestvo() + "\t"
//                         + studentyi.get(i).getGruppyi().getNazvanie());
//             }

//             for(int i = 0; i<= studentyi.size();i++){
//               System.out.println("\t" + studentyi.get(i).getFamiliya());
//             }

// >>>>>>> master
    }
}
