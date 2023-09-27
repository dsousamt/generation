create database db_generation_game_online;
use db_generation_game_online;
create table tb_personagens(
	id bigint auto_increment not null primary key,
    nome varchar(255) not null,
    ataque int not null,
    defesa int not null,
    inteligencia int not null,
    carisma int not null,
    classe_id bigint not null
);
create table tb_classes(
	id bigint auto_increment not null primary key,
    nome varchar(255) not null,
    mana int not null,
    vida int not null
);

insert into tb_classes (nome, mana, vida)
values ("Guerreiro",20,100);
insert into tb_classes (nome, mana, vida)
values ("Mago",100,20);
insert into tb_classes (nome, mana, vida)
values ("Ladino",40,90);
insert into tb_classes (nome, mana, vida)
values ("Clérigo",80,90);
insert into tb_classes (nome, mana, vida)
values ("Arqueiro",50,85);

alter table tb_personagens 
add constraint fk_personagem_classe
foreign key (classe_id) references tb_classes(id);

insert into tb_personagens (nome, ataque, defesa, inteligencia, carisma, classe_id)
values ("Sir Reginald",3800,3200,750,600,1);
insert into tb_personagens (nome, ataque, defesa, inteligencia, carisma, classe_id)
values ("Elara Silverwing",2200,1200,3800,1200,2);
insert into tb_personagens (nome, ataque, defesa, inteligencia, carisma, classe_id)
values ("Clandestine Shadowblade",3000,1800,1200,2800,3);
insert into tb_personagens (nome, ataque, defesa, inteligencia, carisma, classe_id)
values ("High Priestess Seraphine",1400,2800,2600,3400,4);
insert into tb_personagens (nome, ataque, defesa, inteligencia, carisma, classe_id)
values ("Lyanna Swiftshot",3800,1600,1100,1800,5);
insert into tb_personagens (nome, ataque, defesa, inteligencia, carisma, classe_id)
values ("Bjorn Ironfist",3200,3800,800,700,1);
insert into tb_personagens (nome, ataque, defesa, inteligencia, carisma, classe_id)
values ("Aurelia Frostbloom",1700,900,3900,1600,2);
insert into tb_personagens (nome, ataque, defesa, inteligencia, carisma, classe_id)
values ("Gael Nightshade",2800,3200,1600,3500,3);

select * from tb_personagens where ataque > 2000;
select * from tb_personagens where defesa between 1000 and 2000;
select * from tb_personagens where nome like "%c%";

select * from tb_personagens
inner join tb_classes
on tb_personagens.classe_id = tb_classes.id;

select * from tb_personagens
inner join tb_classes
on tb_classes.id = tb_personagens.classe_id
where tb_personagens.classe_id = 1;
