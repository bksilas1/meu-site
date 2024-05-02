document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('cadastroForm');
    const resultado = document.getElementById('resultado');

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        const nome = document.getElementById('nome').value;
        const email = document.getElementById('email').value;
        const senha = document.getElementById('senha').value;

        // Simples validação do formulário
        if (nome && email && senha) {
            resultado.innerHTML = `
                <p>Nome: ${nome}</p>
                <p>Email: ${email}</p>
                <p>Senha: ${senha}</p>
                <p>Usuário cadastrado com sucesso!</p>
            `;
        } else {
            resultado.innerHTML = '<p>Preencha todos os campos!</p>';
        }
    });
});



