document.addEventListener('DOMContentLoaded', () => {
    let slideIndex = 0;

    function showSlide(index) {
        const slides = document.querySelectorAll('.carousel-slide');
        if (index >= slides.length) {
            slideIndex = 0;
        }
        if (index < 0) {
            slideIndex = slides.length - 1;
        }
        slides.forEach((slide) => {
            slide.style.transform = `translateX(-${slideIndex * 100}%)`;
        });
    }

    function moveSlide(step) {
        showSlide(slideIndex += step);
    }

    // Initialize carousel
    showSlide(slideIndex);

    // Auto-slide functionality
    setInterval(() => {
        moveSlide(1);
    }, 5000); // Change slide every 5 seconds

    // Attach event listeners to navigation buttons
    document.querySelector('.carousel-prev').addEventListener('click', () => moveSlide(-1));
    document.querySelector('.carousel-next').addEventListener('click', () => moveSlide(1));
});
