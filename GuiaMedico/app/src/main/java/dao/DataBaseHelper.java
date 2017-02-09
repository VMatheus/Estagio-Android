package dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by matheus on 01/02/17.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String BANCO = "tasks";
    private static final int VERSAO = 1;

    public DataBaseHelper(Context context) {
        super(context, BANCO, null, VERSAO);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table estados(_id integer primary key autoincrement," +
                "nome text not null )");


        //Preenchimento da tabela de estados
        db.execSQL("insert into estados(nome) values ('Acre') ");
        db.execSQL("insert into estados(nome) values ('Alagoas') ");
        db.execSQL("insert into estados(nome) values ('Amapá') ");
        db.execSQL("insert into estados(nome) values ('Amazonas') ");
        db.execSQL("insert into estados(nome) values ('Bahia') ");
        db.execSQL("insert into estados(nome) values ('Ceará') ");
        db.execSQL("insert into estados(nome) values ('Distrito Federal') ");
        db.execSQL("insert into estados(nome) values ('Espirito Santo') ");
        db.execSQL("insert into estados(nome) values ('Goiás') ");
        db.execSQL("insert into estados(nome) values ('Maranhão') ");
        db.execSQL("insert into estados(nome) values ('Mato Grosso') ");
        db.execSQL("insert into estados(nome) values ('Mato Grosso do Sul') ");
        db.execSQL("insert into estados(nome) values ('Minas Gerais') ");
        db.execSQL("insert into estados(nome) values ('Pará') ");
        db.execSQL("insert into estados(nome) values ('Paraíba') ");
        db.execSQL("insert into estados(nome) values ('Paraná') ");
        db.execSQL("insert into estados(nome) values ('Pernambuco') ");
        db.execSQL("insert into estados(nome) values ('Piauí') ");
        db.execSQL("insert into estados(nome) values ('Rio de Janeiro') ");
        db.execSQL("insert into estados(nome) values ('Rio Grande do Norte') ");
        db.execSQL("insert into estados(nome) values ('Rio Grande do Sul') ");
        db.execSQL("insert into estados(nome) values ('Rondônia') ");
        db.execSQL("insert into estados(nome) values ('Roraima') ");
        db.execSQL("insert into estados(nome) values ('Santa Catarina') ");
        db.execSQL("insert into estados(nome) values ('São Paulo') ");
        db.execSQL("insert into estados(nome) values ('Sergipe') ");
        db.execSQL("insert into estados(nome) values ('Tocantins') ");

        //Tabela de Cidades
        db.execSQL("create table cidades(_id integer primary key autoincrement," +
                "nome text not null," +
                "id_estado integer not null)");

        //Preenchimento da tabela de Cidades

        //Acre
        db.execSQL("insert into cidades(nome, id_estado) values('Rio Branco','1')");

        //Alagoas
        db.execSQL("insert into cidades(nome, id_estado) values('Maceió','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('Arapiraca','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('Delmiro Gouveia','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('Marechal Deodoro','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('Olho dÁgua das Flores','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('Palmeira dos Índios','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('Penedo','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('Piranhas','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santana do Ipanema','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('São Miguel dos Campos','2')");
        db.execSQL("insert into cidades(nome, id_estado) values('Viçosa','2')");

        //Amapa
        db.execSQL("insert into cidades(nome, id_estado) values('Macapá','3')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santana','3')");

        //Amazonas
        db.execSQL("insert into cidades(nome, id_estado) values('Itacoatiara','4')");
        db.execSQL("insert into cidades(nome, id_estado) values('Manacapuru','4')");
        db.execSQL("insert into cidades(nome, id_estado) values('Manaus','4')");
        db.execSQL("insert into cidades(nome, id_estado) values('Tefé','4')");


        //Bahia
        db.execSQL("insert into cidades(nome, id_estado) values('Salvador','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Acajutiba','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Alagoinhas','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Amargosa','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Barra do Choça','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Barreiras','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Belmonte','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Bom Jesus da Lapa','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Brumado','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cachoeira','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Caetité','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Camacan','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Camaraçari','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Campo Formoso','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Canavieras','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Candeias','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Caravelas','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Casa Nova','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Castro Alves','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Catu','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Conceição do Jacuipe','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Condeúba','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cruz das Almas','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Dias dÁvila','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Entre Rios','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Esplanada','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Eunápolis','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Feira de Santana','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Gandu','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Guanambi','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Guaratinga','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Iaçu','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ibicaraí','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ibirapuã','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ibotirama','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Iguaí','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ilheus','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ipiaú','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ipirá','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Irecê','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itabel','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itaberaba','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itabuna','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itamaraju','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itanhém','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itapetinga','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Jacobina','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Jaguaquara','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Jaguarari','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Jaquié','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Juazeiro','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Laje','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Lauro Freitas','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Livramento de Nossa Senhora','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Luís Eduardo Magalhães','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Macarani','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Madre de Deus','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Maiquinique','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Mata de São João','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Medeiros Neto','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Mucuri','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Nazaré','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Nova Viçosa','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Paulo Afonso','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Planalto','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Poções','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Pojuca','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Porto Seguro','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Prado','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Remanso','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Riacho do Jacuípe','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ruy Barbosa','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santa Cruz Cabrália','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santa Maria da Vitória','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santo Amaro','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santo Antônio de Jesus','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('São Felipe','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('São Gonçalo dos Campos','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('São Sebastião do Passé','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Seabra','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Senhor do Bonfim','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Serrinha','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Simões Filho','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Teixeira de Freitas','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Teofilândia','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ubaitaba','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Uibaí','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Una','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Uruçuca','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Valença','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Vera Cruz','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Vitória da Conquista','5')");
        db.execSQL("insert into cidades(nome, id_estado) values('Xique-Xique','5')");


        //Ceará
        db.execSQL("insert into cidades(nome, id_estado) values('Fortaleza','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Aracajú','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Acopiara','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Amontada','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Aracati','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Araripe','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Assaré','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Aurora','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Barabalha','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Barro','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Baturité','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Beberibe','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Bela Cruz','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Boa Viagem','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Brejo Santo','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Camocim','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Campos Sales','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Canindé','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Carnaubal','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cascavel','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Caucaia','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cedro','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Crateús','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Crato','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cruz','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Eusébio','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Frecheirinha','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Granja','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Guaraciaba do Norte','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Horizonte','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Icó','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Iguatu','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Independência','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ipu','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ipueiras','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Irauçuba','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itapagé','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itapipoca','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Jaguaribe','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Jardim','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Juazeiro do Norte','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Jucás','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Lavras da Mangabeira','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Limoeiro do Norte','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Maracanaú','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Maranguape','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Maranguape','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Marco','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Massapê','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Mauriti','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Milagres','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Milhã','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Missão Velha','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Mombaça','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Monsenhor Tabosa','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Morada Nova','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Morrinhos','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Nova Russas','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Novo Oriente','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Orós','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Pacajus','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Paracuru','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Paraiba','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Parambu','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Pedra Branca','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Pentecoste','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Pindoretama','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Potengi','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Quixeramobin','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Redenção','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Russas','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santa Quitéria','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santana do Acaraú','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('São Benedito','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('São Gonçalo do Amarante','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Senador Pombeu','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Sobral','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Tabuleiro do Norte','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Tauá','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Tinguá','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Trairi','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Tururu','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ubajara','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Umirim','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Uruburetama','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Várzea Alegre ','6')");
        db.execSQL("insert into cidades(nome, id_estado) values('Viçosa do Ceará','6')");

        //Distrito Federal
        db.execSQL("insert into cidades(nome, id_estado) values('Brasília','7')");


        //Espirito Santo
        db.execSQL("insert into cidades(nome, id_estado) values('Vitória','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Grande Vitória','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Afonso Cláudio','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Água doce do Norte','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Alegre','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Alfredo Chaves ','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Anchieta','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Aracruz','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Baixo Guandu','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Barra de São Francisco','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Boa Esperança','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cachoeiro de Itapemirim','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cariacica','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Castelo','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Colatina','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Conceição da Barra','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Conceição do castelo','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Divino de São Lourenço','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Domingos Martins','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ecoporanga','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Fundão','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Governador Lindemberg','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Guaçuí','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Guarapari','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ibatiba','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ibiraçu','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Iconha','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Irupi','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itaguaçu','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itapemirim','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Itarana','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Iúna','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Jaguaré','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Jerônimo Monteiro','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('João Neiva','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Laranja da Teraa','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Linhares','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Mantenópolis','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Marataízes','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Marechal Floriano','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Mimoso do Sul','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Montanha','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Montanha','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Muniz Freire','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Muqui','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Nova Venécia','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Pancas','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Pedro Canário','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Pinheiros','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Piúma','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Rio Bananal','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Rio Novo do Sul','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santa Maria de Jetibá','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Santa Tereza','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('São Gabriel da Palha','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('São José do Calçado','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('São Matheus','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('São Roque do Canaã','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Serra','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Sooretama','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Vargem Alta','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Venda Nova do Imigrante','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Vila Valério','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Vila Velha','8')");
        db.execSQL("insert into cidades(nome, id_estado) values('Vila Velha','8')");


        //Goias

        db.execSQL("insert into cidades(nome, id_estado) values('Goiânia','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Acreúna','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Alexânia','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Anápolis','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Aparecida de Goiânia','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Aragarças','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Barro Alto','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Bela Vista de Goiás','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Bom Jardim de Goiás','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Bom Jesus de Goiás','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Buriti Alegre','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cabeceiras','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cachoeira Alta','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cachoeira Dourada','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Caçu','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Caiapônia','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Caldas Novas','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Campinorte','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Campo Alegre de Goiás','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Campos Belos','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Carmo do Rio Verde','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Catalão','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Ceres','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Chapadão do Céu','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cidade Ocidental','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Cristalina','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Crixás','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Edealina','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Edéia','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Formosa','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Goianésia','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Goianira','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Goiás','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Goiás','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Goiatuba','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Inaciolândia','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('Indiara','9')");
        db.execSQL("insert into cidades(nome, id_estado) values('I','9')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public static class Estados {
        public static final String TABELA = "estados";
        public static final String _ID = "_id";
        public static final String NOME = "nome";

        public static final String[] COLUNAS = new String[]{
                _ID, NOME
        };


    }

    public static class Cidades {
        public static final String TABELA = "cidades";
        public static final String _ID = "_id";
        public static final String NOME = "nome";
        public static final String ID_ESTADO = "id_estado";


        public static final String[] COLUNAS = new String[]{
                _ID, NOME, ID_ESTADO
        };
    }
}
