$(document).ready(function(){
    $('.dropdown-trigger').dropdown();
    $('.sidenav').sidenav();
    $('.modal').modal();
    $('select').formSelect();
    $('.collapsible').collapsible();
    $('.tooltipped').tooltip();
    $('.parallax').parallax();
    $('.timepicker').timepicker({ i18n: {
      cancel: 'Cancelar',
      clear: 'Limpar',
      done: 'OK'
      }
    });
    $('.datepicker').datepicker({ i18n: {
      months: ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'],
      monthsShort: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'],
      weekdays: ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sabádo'],
      weekdaysShort: ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sab'],
      weekdaysAbbrev: ['D', 'S', 'T', 'Q', 'Q', 'S', 'S'],
      today: 'Hoje',
      clear: 'Limpar',
      done: 'Pronto',
      cancel: 'Cancelar',
      nextMonth: 'Próximo mês',
      previousMonth: 'Mês anterior',
      selectMonths: true, 
      selectYears: 15 
      }
    });
    $('.option i.absolute').mouseenter((e) => {
      var service_name = $(e.target).siblings('p')[0].innerHTML;
      var service_text =  $(e.target).attr('data-text');
      $('#modal-services h4').html(service_name);
      $('#modal-services p').html(service_text);
      $('#modal-services').modal('open');
    });
  });